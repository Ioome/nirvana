# JDK动态代理（1）代理模式实现方式的概要介绍📃

##### 什么是代理模式,为什么使用代理，代理模式实现方式有哪些,底层机制是怎样的

----

1. 代理是中间人
2. 代理能让我们专注别的事情,其余事情交给中介去做
3. 静态代理 和 动态代理

### 静态实现📃📃

![img.png](img.png)

```java
/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 接口
 * @author: Mr.wang.sutton
 * @create: 2022-10-20 15:54
 **/
public interface UserDao {

    /**
     * 保存接口
     */
    void save();
}

```

此接口是为了 **中介对象** 和  **代理** 都可以有相应的方法，意思是我小小中介既然要为你
做事说明我要知道这件事情是什么事情,其余是我自己的事情.

```java
/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 目标对象
 * @author: Mr.wang.sutton
 * @create: 2022-10-20 15:54
 **/
public class UserDaoImpl implements UserDao {

    /**
     * 保存接口
     */
    @Override
    public void save() {
        System.out.println("正在保存用户.....");
    }
}
```

目前我有一个保存人的事情，但是我觉得我做的不够好,我需要中间商去帮我处理这件事情.

```java
public class TransactionHandler extends UserDaoImpl implements UserDao {


    /**
     * 传入需要被代理的类型
     */
    private UserDaoImpl userDao;


    /**
     * 传入需要被代理的对象
     * @param userDao
     */
    public TransactionHandler(UserDaoImpl userDao) {
        this.userDao = userDao;
    }


    /**
     * 保存接口
     */
    @Override
    public void save() {
        System.out.println("开启事务");
        userDao.save();
        System.out.println("结束事务");
    }
}

```

要我帮你做事可以啊，但是前提是我需要知道你要给我什么功能，所以这里是需要目标对象的一个引用.

缺点:

~~~
但是静态代理不能使一个代理类反复作用于多个目标对象，代理对象直接持有目标对象的引用，这导致代理对象和目标对象类型紧密耦合了在一起。如果UserDao接口下还有另一个实现类也需要进行事务控制，
那么就要重新写一个代理类，这样就会产生许多重复的模版代码，
不能达到代码复用的目的。而动态代理就可以很好的解决这样的问题
~~~

### 动态代理🤑

动态代码如何解决持有目标对象的引用.通过 **Object**.那么在动态代理也更换了调用方法的方式

```java
/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 接口
 * @author: Mr.wang.sutton
 * @create: 2022-10-20 16:04
 **/
public interface UserDao {
    void save();
}

```

同样的我们有.save的方法推给代理做

```java
/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 目标对象
 * @author: Mr.wang.sutton
 * @create: 2022-10-20 16:04
 **/
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("保存用户信息...");
    }
}
```

我是雇主

```java
public class TransactionHandler implements InvocationHandler {

    //需要代理的目标对象
    //这里设计为可以为任意对象添加事务控制, 所以将目标对象声明为Object
    private Object target;


    //构造TransactionHandler时传入目标对象
    public TransactionHandler(Object target) {
        this.target = target;
    }

    /**
     * @param proxy  the proxy instance that the method was invoked on
     * @param method the {@code Method} instance corresponding to
     *               the interface method invoked on the proxy instance.  The declaring
     *               class of the {@code Method} object will be the interface that
     *               the method was declared in, which may be a superinterface of the
     *               proxy interface that the proxy class inherits the method through.
     * @param args   an array of objects containing the values of the
     *               arguments passed in the method invocation on the proxy instance,
     *               or {@code null} if interface method takes no arguments.
     *               Arguments of primitive types are wrapped in instances of the
     *               appropriate primitive wrapper class, such as
     *               {@code java.lang.Integer} or {@code java.lang.Boolean}.
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //调用目标方法前的处理
        System.out.println("开启事务控制...");
        //调用目标对象的方法
        Object result = method.invoke(target, args);
        //调用目标方法后的处理
        System.out.println("关闭事务控制...");
        return null;
    }
}

```

静态代理的方式是，我把目标对象传给你，你生成自己一个代理对象后就去调用方法
而动态代理是:我传给你一个代理控制器对吧，然后最终去创建代理对象的是

```java
        UserDao userDao=(UserDao)Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),handler);

```

然后最终返回的是一个是西安 UserDao 的对象.最终 UserDao 调用 save。<br />

那么产生一个问题?

```java
Proxy.newProxyInstance
```

到底是如何使用的.这种技术叫做
利用Java的反射技术(Java Reflection)，在运行时创建一个实现某些给定接口的新类
代理的是接口而不是类的意思是，它最终代理接口引用最终产生出来的是你传入的参数.
这个对象也就只有运行时会知道.

~~~
loader: 用哪个类加载器去加载代理对象
interfaces:动态代理类需要实现的接口
h:代理实现类
~~~

### 源码分析

----

~~~

Proxy类的静态方法newProxyInstance方法去生成一个代理类，这个静态方法接收三个参数，分别是目标类的类加载器，目标类实现的接口集合
，InvocationHandler实例，最后返回一个Object类型的代理类
~~~


##### newProxyInstance 🧵
````java
public static Object newProxyInstance(ClassLoader loader,
                                      Class<?>[] interfaces,
                                      InvocationHandler h) throws IllegalArgumentException {
    //验证传入的InvocationHandler不能为空
    Objects.requireNonNull(h);
    //复制代理类实现的所有接口
    final Class<?>[] intfs = interfaces.clone();
    //获取安全管理器
    final SecurityManager sm = System.getSecurityManager();
    //进行一些权限检验
    if (sm != null) {
        checkProxyAccess(Reflection.getCallerClass(), loader, intfs);
    }
    //该方法先从缓存获取代理类, 如果没有再去生成一个代理类
    Class<?> cl = getProxyClass0(loader, intfs);
    try {
        //进行一些权限检验
        if (sm != null) {
            checkNewProxyPermission(Reflection.getCallerClass(), cl);
        }
        //获取参数类型是InvocationHandler.class的代理类构造器
        final Constructor<?> cons = cl.getConstructor(constructorParams);
        final InvocationHandler ih = h;
        //如果代理类是不可访问的, 就使用特权将它的构造器设置为可访问
        if (!Modifier.isPublic(cl.getModifiers())) {
            AccessController.doPrivileged(new PrivilegedAction<Void>() {
                public Void run() {
                    cons.setAccessible(true);
                    return null;
                }
            });
        }
        //传入InvocationHandler实例去构造一个代理类的实例
        //所有代理类都继承自Proxy, 因此这里会调用Proxy的构造器将InvocationHandler引用传入
        return cons.newInstance(new Object[]{h});
    } catch (Exception e) {
        //为了节省篇幅, 笔者统一用Exception捕获了所有异常
        throw new InternalError(e.toString(), e);
    }
}
````
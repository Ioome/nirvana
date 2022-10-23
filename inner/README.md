# 内部类
为什么要存在内部类 <br />
内部类与外部类的关系 <br />
内部的分类及几种分类的详细使用注意事项 <br />
实际开发中会遇到内部类的问题 <br />

##### 内部类概念
```java
存放在类的内部
```

##### 为什么要存在
1. 内部类可以对同一包中的其他类隐藏起来
2. 内部类可以实现 java 单继承的缺陷
3. 当我们想要定义一个回调函数却不想写大量代码的时候我们可以选择使用匿名内部类来实现


##### 隐藏
我们都知道外部类即普通的类不能使用 private protected 访问权限符来修饰的，而内部类则可以使用 private 和 protected 来修饰



##### 内部类可以实现 java 单继承的缺陷
```java
package com.sutton.inner.MainExample;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-22 00:19
 **/
public class MainExample {

    private class Test1 extends ClassA{
        public String name(){
            return super.name();
        }
    }
    private class Test2 extends ClassB{
        public int age(){
            return super.age();
        }
    }
    public String name(){
        return new Test1().name();
    }
    public int age(){
        return new Test2().age();
    }

    public static void main(String[] args) {
        MainExample mainExample=new MainExample();
        System.out.println(mainExample.age());
        System.out.println(mainExample.name());
    }
}

```

##### 通过匿名内部类来"优化"简单的接口实现
匿名内部类 + lambda

##### 内部类与外部类的关系
对于非静态内部类，内部类的创建依赖外部类的实例对象，在没有外部类实例之前是无法创建内部类的
<br />
当然只有普通内部类依赖外部.静态是不依赖的.所以我们学习内部类的时候要注意 静态类 静态成员和静态方法在内部类上的一些问题


##### 方法和作用域内的内部类
类中方法内有内部类,周期存在于方法

##### 为什么有局部内部类
1. 返回引用
2. 解决复杂问题


##### 解决分类
静态内部类（嵌套类）和非静态内部类

----
非静态内部类
1. 成员内部类、
2. 方法内部类、
3. 匿名内部类
<br />
静态内部类

##### 解决区别
静态内部类可以有静态成员，而非静态内部类则不能有静态成员。<br />
静态内部类可以访问外部类的静态变量，而不可访问外部类的非静态变量 <br />
非静态内部类的非静态成员可以访问外部类的非静态变量  <br />
静态内部类的创建不依赖于外部类，而非静态内部类必须依赖于外部类的创建而创建。<br />


### 匿名内部类
匿名内部类是没有访问修饰符的
匿名内部类必须继承一个抽象类或者实现一个接口。为什么
匿名内部类中不能存在任何静态成员或方法
匿名内部类是没有构造方法的，因为它没有类名 为什么
与局部内部相同匿名内部类也可以引用局部变量。此变量也必须声明为 final。为什么

解决最后一个问题
匿名内部类是创建后是存储在堆中的，而方法中的局部变量是存储在Java栈中，当方法执行完毕后，就进行退栈，同时局部变量也会消失。那么此时匿名内部类还有可能在堆中存储着，那么匿名内部类要到哪里去找这个局部变量呢？

为了解决这个问题编译器为自动地帮我们在匿名内部类中创建了一个局部变量的备份，也就是说即使方法执行结束，匿名内部类中还有一个备份，自然就不怕找不到了。

但是问题又来了。如果局部变量中的a不停的在变化。那么岂不是也要让备份的a变量无时无刻的变化。为了保持局部变量与匿名内部类中备份域保持一致。编译器不得不规定死这些局部域必须是常量，一旦赋值不能再发生变化了。所以为什么匿名内部类应用外部方法的域必须是常量域的原因所在了

```dockerignore
new 父类构造器（参数列表）|实现接口（）     

{      

    //匿名内部类的类体部分     

}
```
```java
package com.sutton.inner.Button;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-22 00:39
 **/

//匿名内部类必须继承或实现一个已有的接口
interface ActionListener {
    public void onAction();
}


public class Button {
    public void click(final int params) {
        new ActionListener() {

            /**
             *
             */
            @Override
            public void onAction() {
                System.out.println("click action..." + params);

            }
        }.onAction();

    }

    public static void main(String[] args) {
        Button button = new Button();
        button.click(10);
    }
}

```
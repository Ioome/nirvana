# 对象导论

##### 抽象过程
~~~
 将问题抽象成机器能够处理的,这是复杂的. 业务与解空间(计算机)对应这是需要丰富的经验.
~~~
面向对象通过向开发人员提供了表示问题空间的元素,表示为 '对象'.
1. 万物皆对象
2. 程序是对象的集合
3. 每个对象都有自己的由其他对象所构成的存储
4. 每个对象都有类型
5. 某一特定类型的所有对象都可以接受同样的消息

##### 每个对象都有一个接口

```java
class
class 创建实例
class 具有共性
对象可以发送消息.
构造器初始化解决命名问题
重载
如何区分重载:参数问题 重载如何来的
返回值是不可区分值
默认构造器
this区分不同对象的标识
构造器调用构造器
static
指定初始化
构造器初始化
初始化顺序 static->静态块->new->构造器.
显示的静态初始化
可变参数
```
如何创建有用的对象. 产生对象的请求.使得对象完成任务。class 决定了某个对象能发送的请求

##### 每个对象都提供服务
我们开发所做的事情就是创建一系列对象去解决一系列问题.一个好的对象是拥有高内聚,低耦合的.

##### 被隐藏的具体实现
对外提供相应的实现,隐藏需要安全的数据
public private  protected default

##### 复用具体实现
组合:has-a<br />
继承:extends   <br />

**继承**

----
产生的原因：冗余代码的出现,抽象成一个  class  其他类去继承它.类型不仅仅是作用一个对象集合上的约束条件，还表示了
其他类型的关系.也表示可以处理更多的消息.

1. 差异性
2. 复用父类的属性
3. 覆盖
<br />
是一个与像是一个的关系.is-like-a 关系.


##### 伴随多态的可互换对象
1. 方法泛化
2. 多种状态消息发送.对象根据具体类型来执行恰当的代码
3. 前期绑定 和 后期绑定
4. 向上转型
5. 向下转型
~~~
通过多态可以保证具体信息是分离的.
~~~

##### 单继承结构
java 是单继承的.

##### 容器 
数据的大小是可扩展的.具有一定特性的容器.

##### 参数化类型
类型将会像方法一样是被动接受类型.传入的是什么类型那么将会是什么类型.

##### 对象的创建和生命周期
对象用完之后不能一直存在.

##### 异常处理
异常也是对象,从出错点抛出，并被专门设计用来处理特定类型错误的异常处理器 "捕获".

##### 并发处理
同一时刻多个任务执行的思想

##### web
网上冲浪，


##### 客户/服务器
客户使用数据,服务器处理数据
1. 服务器
2. 均衡
3. 事务处理
4. 中间件
5. 分发

##### 客户端编程
Javascript
HTML 
Css
plugin
JAVA .

##### 服务端编程
Java
python 
javascript
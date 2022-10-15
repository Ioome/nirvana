一切皆是对象 ✍
---
> **"如果我们说另一种不同的语言，那么我们将会发觉有一个新的世界🌏"**
[书籍] http://static.kancloud.cn/wizardforcel/thinking-in-java/418032

### <font size=20px color=#85debf>目录📓 </font>

---
- [用引用操纵对象](#a-name-b)
- [必须由你创建所有的对象](#)
- [基本类型]()
- [永远不需要销毁对象]()
- [创建新的数据类型：类]()
- [方法，参数和返回值]()
- [参数列表]()
- [开始进入美好的世界了🌏]()
- [static]()
- [我的第一个 Java 程序]()
- [编译和运行]()
- [注释和嵌入式文档]()
- [文档示例]()
- [编码风格]()
- [手动环节]()

---
## <p name="quote">2.1 用引用操纵对象</p>
**什么是引用** <br />
它是一个 **整数** 用于应用程序中标识一个实体的整数,大部分开发者习惯的称呼是: **引用**<br />
它源于内存管理机制的问题，即虚拟地址。简而言之数据的地址需要变动，变动以后就需要有人来记录、管理变动，因此系统用句柄来记载数据地址的变更

```
     public static void main(String[] args) {
        String s;
        System.out.println(s.getBytes(StandardCharsets.UTF_8));
    }
```
上方的 s 是一个引用,很可惜它是一个空的引用，也就说它并没有保存任何的东西.
我们用一张图片去描述这个现象

## <p name="myslef">2.2 由你创建所有对象</p>
变量的“存在时间”（Lifetime）一直是程序员需要着重考虑的问题。变量应持续多长的时间？如果想清除它，那么何时进行？
#### 给我一个新对象👩

```
   String  baby=new String("new 就是一个上帝,它给了我一个完美的对象");
   System.out.println(baby.getBytes());
```
 <br />

#### 对象存储到了什么地方

---
1. **寄存器**:<br />处于 CPU 内部,基本寄存器只能并行送入数据，也只能并行输出。移位寄存器中的数据可以在移位脉冲作用下依次逐位右移或左移，数据既可以并行输入、并行输出，也可以串行输入、串行输出，还可以并行输入、串行输出，或串行输入、并行输出，十分灵活，用途也很广.
2. **堆栈**: 方法调用，线程状态(参数，局部变量，中间计算过程)
3. **堆**: <br />存放对象实例
4. **常量存储**: <br />常量值
5. **非 RAM 存储**: <br />流对象和持久化对象



#### 基本类

---
-  boolean
-  byte-8 bits
-  char-16 bits
-  short 16 bits
-  int  32 bits
-  long 64 bits
-  float 32 bits
-  double 64 bits
-  void 

Java 为了可移植性，基本数据类型的大小是固定的，即时移动到一台新的机器<br />
它的大小也不会改变.
 
#### 高精度数字:BigInteger And BigDecimal
为什么有专门处理高精度的类?
这是因为在 Java 在处理一些金额领域上，基本类型是不能够对付的,会产生软件工程领域上的一个问题: **精度损失**
```java
 public class highPrecision {
    public static void main(String[] args) {
        System.out.println(0.05 + 0.01);
        System.out.println(1.0 - 0.42);
        System.out.println(4.015 * 100);
        System.out.println(123.3 / 100);
        BigDecimal bigDecimal=new BigDecimal(0.1);
    }
}
```
那么产生这个的原因是什么呢？ 
这是因为计算机是二进制表示的，我们都很清楚这个，浮点数是无法精确表示的.

[细节]https://jingyan.baidu.com/article/425e69e6e93ca9be15fc1626.html

#### 如何解决
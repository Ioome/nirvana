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
使用   BigDecimal  类  解决这个问题
```java
package com.sutton.everythingIsAnObject.util;

import java.math.BigDecimal;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 由于Java的简单类型不能够精确的对浮点数进行运算，这个工具类提供精   * 确的浮点数运算，包括加减乘除和四舍五入
 * @author: Mr.wang.sutton
 * @create: 2022-10-15 17:35
 **/
public class ArithUntil {

    /**
     * 默认除法运算精度
     */
    private static final int DEF_DIV_SCALE = 10;

    /**
     * 默认不可实例化
     */
    private ArithUntil() {
    }

    /**
     * 处理加法运算
     *
     * @param parameter_one
     * @param parameter_two
     * @return double
     */
    public static double add(double parameter_one, double parameter_two) {
        BigDecimal param_one = new BigDecimal(String.valueOf(parameter_one));
        BigDecimal parma_two = new BigDecimal(String.valueOf(parameter_two));
        return param_one.add(parma_two).doubleValue();
    }

    /**
     * 作一个减法操作
     *
     * @param parameter_one
     * @param parameter_two
     * @return 两者相减去的结果
     */
    public static double substract(double parameter_one, double parameter_two) {
        BigDecimal param_one = new BigDecimal(String.valueOf(parameter_one));
        BigDecimal parma_two = new BigDecimal(String.valueOf(parameter_two));
        return param_one.subtract(parma_two).doubleValue();
    }

    /**
     * 乘法操作
     *
     * @param parameter_one
     * @param parameter_two
     * @return 两者相乘的结果
     */
    public static double multiplication(double parameter_one, double parameter_two) {
        BigDecimal param_one = new BigDecimal(String.valueOf(parameter_one));
        BigDecimal parma_two = new BigDecimal(String.valueOf(parameter_two));
        return param_one.multiply(parma_two).doubleValue();
    }

    /**
     * 除法操作
     *
     * @param parameter_one
     * @param parameter_two
     * @return 两者相除的结果
     */
    public static double division(double parameter_one, double parameter_two) {
        return accuracyCalculation(parameter_one, parameter_two, DEF_DIV_SCALE);
    }

    /**
     * 根据 DEF_DIV_SCALE 对不可精确的数进行四舍五入
     *
     * @param parameter_one
     * @param parameter_two
     * @param defaultDivScale
     * @return 被 defaultDivScale 处理过的一个除法操作结果.
     */
    public static double accuracyCalculation(double parameter_one, double parameter_two, int defaultDivScale) {
        if (defaultDivScale < 0) {
            throw new IllegalArgumentException("The Scale must a positive Integer👩");
        }
        BigDecimal param_one = new BigDecimal(parameter_one);
        BigDecimal param_two = new BigDecimal(parameter_two);
        return param_one.divide(param_two).doubleValue();
    }


    /**
     * 四舍五入
     * @param parameter_one
     * @param defaultDivScale
     * @return 返回已经四舍五入的结果
     */
    public static double round(double parameter_one, int defaultDivScale) {
        if (defaultDivScale < 0) {
            throw new IllegalArgumentException("The scale must  a positive Integer.");
        }
        BigDecimal param_one = new BigDecimal(parameter_one);
        BigDecimal one_Accuracy = new BigDecimal("1");
        return param_one.divide(one_Accuracy, defaultDivScale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }


}
```

### 变量作用域

--- 
在 java 中 {} 控制了 变量的访问控制 和 生命周期

```java
public class scope {

    public static void variableScope() {
        int x = 12;
        //Only  x ariable
        {
          int q=96;
          //Both x & q available
        }
        //errot example
        System.out.println(q);
        //Only x available
        //q is  "out of scope"
    }

    public static void main(String[] args) {
        scope.variableScope();
    }

}
```
对象的作用域比较特殊,尽管超出了作用域,但是它是存在的，不会直接从内存去除
<br />记得只是对象不会从内存去除，但是引用还是会引用不了那个对象.


###  新的数据类型

--- 
class 这个关键字我们将会一直使用喔.
```java
 class AtypeName{/**Class body goes here**/}
```
在未产生服务之前，它不能做任何事情,也就是说它是一个不能提供服务的 '**waste**'


### 字段和方法

--- 
获取你可想象它是一个很完美的 '**构造 Java 世界元素的一个盒子**'
这个盒子比较特殊,它可以根据 'class' 产生一定的实体,什么意思呢?
我们需要通过蓝图  class 去创造一个**卡里怕(一种怪物)**.
假设盒子里面有一个属性是: **kkalipaaName**,这个盒子将会去创建一个
一个真正的 卡里怕. 每个实体都有名字.那么我们需要这个盒子拥有一个 **动作**
返回 **卡里怕** 的名字.好了,我们想象好了，我们需要一个这样的盒子.📦

##### 卡里怕盒子📦

```java
/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 卡里怕盒子
 * @author: Mr.wang.sutton
 * @create: 2022-10-16 20:06
 **/
public class kkalipaaBox {

    /**
     *  盒子有个卡里怕名字
     */
    private  String  kkalipaaName;

    /**
     *  卡里怕动作
     */
    public String getKkalipaaName() {
        return kkalipaaName;
    }
}
```
卡里怕实体出现了，它是一个没有名字的卡里怕.
```java
 public static void main(String[] args) {
        kkalipaaBox kkalipaaBox=new kkalipaaBox();
        System.out.println(kkalipaaBox.getKkalipaaName());
}
```
哇喔, 太恐怖了😵‍💫.
那么我们给他一个取名字的动作吧
```java
  public void setKkalipaaName(String kkalipaaName) {
        this.kkalipaaName = kkalipaaName;
    }

```
我们拿着创建元素的引用去发送给这个实体，告诉他，喂！设置一个名字,那么将会
去设置一个值
```java
kkalipaaBox.setKkalipaaName("卡里怕怪物");
```
##### 默认值

--- 
对于类的成员变量

不管程序有没有显示的初始化，Java  虚拟机都会先自动给它初始化为默认值。

1、整数类型（byte、short、int、long）的基本类型变量的默认值为0。

2、单精度浮点型（float）的基本类型变量的默认值为0.0f。

3、双精度浮点型（double）的基本类型变量的默认值为0.0d。

4、字符型（char）的基本类型变量的默认为 “/u0000”。

5、布尔性的基本类型变量的默认值为 false。

6、引用类型的变量是默认值为 null。 

<br />
局部变量初始化 

局部变量声明以后，Java 虚拟机不会自动的为它初始化为默认值。

因此对于局部变量，必须先经过显示的初始化，才能使用它。

如果编译器确认一个局部变量在使用之前可能没有被初始化，编译器将报错

##### 方法 参数 和 返回值

---- 
'方法是用于提供某个服务' 它将嵌入到某个盒子里面提供一定的服务，Java 工程师一般叫他为方法

```java
ReturnType methodName(/****/){
}
```
返回类型是指调用方法之后返回的数值类型<br />
方法名的作用是对具体的方法进行标识和引用<br />
参数列表列出了想传递给方法的信息类型和名称 <br />
**调用方式:**
对象名.方法名(参数1，参数2，参数3...)<br />
**返回值**
返回值的类型必须兼容x的类型

##### 2.5.1 参数列表

----
参数列表规定了我们传送给方法的是什么信息
分基本数据类型，引用类型,不过我告诉你一个秘密，java 是值传递.有过编程经验的人对这个知识点很有感觉,可确实是这样 Java 就是**值传递**
我们先通过一个泡面涨价的例子去学习方法发列表吧
```java
/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 方法参数
 * @author: Mr.wang.sutton
 * @create: 2022-10-17 08:07
 **/
public class paramList {

    /**
     *  商店的泡面
     *  默认:4.0
     */
    private  BigDecimal instantNoodles=new BigDecimal(4.0);

    /**
     * 商店进行涨价的动作
     * @param price
     * @return
     */
    double priceIncrease(BigDecimal price){
        return instantNoodles.subtract(price).doubleValue();
    }

    public BigDecimal getInstantNoodles() {
        return instantNoodles;
    }

    public void setInstantNoodles(BigDecimal instantNoodles) {
        this.instantNoodles = instantNoodles;
    }

    public static void main(String[] args) {
        paramList shopping=new paramList();
        shopping.priceIncrease(new BigDecimal(20));
        System.out.println("泡面涨价了🤑 "+shopping.getInstantNoodles());

    }
}
```
上面例子是我们通过传递涨价的金额，对商店里的泡面进行涨价了,它是根据你传入的参数来觉得涨价多少,
这很神奇.当我们走到 **return**  时,它意味着“离开方法，我已完工了”,**return** 可以是一个值也可以是一个 **表达式(通过式子计算出一个值)🧮**

#### 构建一个程序
2.6.1 名字的可见性

--- 
1.命名空间.建议名字根据功能取名, 并需要符合规范
```java
com.sutton.everythingIsAnObject.Main
```
2.模块之间互相使用
```java
import java.util.Vector;
```
引用包下的一系列类
```java
import java.util.*;
```

2.6.3 static关键字

---
通常，我们创建类时会指出那个类的对象的外观与行为。除非用new创建那个类的一个对象，否则实际上并未得到任何东西
只有执行了new后，才会正式生成数据存储空间，并可使用相应的方法
分两种情况:只想用一个存储区域来保存一个特定的数据  其次:我们需要一个特殊的方法，它没有与这个类的任何对象关联
即使没有创建对象，也需要一个能调用的方法.我们可以通过 **static**,一旦通过这个关键字设置了那么方法或字段将不会与对象
关联在一起.
```java
/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 学校厕所
 * @author: Mr.wang.sutton
 * @create: 2022-10-17 08:53
 **/
public class SCHOOLWC {

    /**
     *  男厕所
     */
    public  static  String boy="男";

    /**
     *  女厕所
     */
    public  static  String girl="女";
}

```
上面定义了两个厕所，分别对应 **男** **女** 学校的所有学生可以去想对应的厕所...
它与对象无关，属于所有学生公共的厕所.


##### 我们的第一个Java程序

----
```java
 System.out.println(new Date());
        Properties p = System.getProperties();
        p.list(System.out);
        System.out.println("--- Memory Usage:");
        System.out.println("---- Memory Usage:");
        Runtime rt=Runtime.getRuntime();
        //总空间,空闲空间,最大空间
        System.out.println("Total memory ="
                        + rt.totalMemory()/1000/1000
                        + " Free memory ="
                        + rt.freeMemory()/1000/1000
                        +"  Max memory ="
                        + rt.maxMemory()/1000/1000);
```
它能打印出与当前运行的系统有关的资料📃


##### 注释和嵌入文档
```java
/* 这是
 * 一段注释，
 * 它跨越了多个行
 */

/* 这是一段注释，
它跨越了多个行 */

// 这是一条单行注释
```
#####  注释文档具体语法
嵌入HTML

----
```java
/**
* 您<em>甚至</em>可以插入一个列表：
* <ol>
* <li> 项目一
* <li> 项目二
* <li> 项目三
* </ol>
*/
```

##### 文档注释

----

1. @version
2. @author

##### 方法文档标记
```java
1. @param
2. @return
3. @exception
4. @deprecated 该标记用于指出一些旧功能已由改进过的新功能取代
```

##### 文档示例
```java
//: Property.java
```





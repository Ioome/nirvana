# 初始化和清除
“随着计算机的进步，‘不安全’的程序设计已成为造成编程代价高昂的罪魁祸首之一。”


#### 用构造器自动初始化
构造器的存在是因为不想,可将其想象成为自己写的每个类都调用一次initialize()
~~~
产生原因:使得开发人员不需要记住 初始化的名字
~~~
SimpleConstructor.java
```java
public Rock() {
    System.out.println(".....Rock");
}

public Rock(int i){
    System.out.println("Creating Rock number" + i);
}
````

#### 方法重载
~~~
在任何程序设计语言中，一项重要的特性就是名字的运用
~~~
为什么有重载
将人类语言中存在细致差别的概念“映射”到一种程序设计语言中时，会出现一些特殊的问题。在日常生活中，我们用相同的词表达多种不同的含义——即词的“重载”
所以重载的出现是因为 '语言上的不同',相同的词意义不同,这就是重载为什么出现.<br />
另一项因素强迫方法名出现重载情况：构造器。由于构造器的名字由类名决定，所以只能有一个构造器名称
Overloading.java
```java
package com.sutton.initAndClean.Overloading;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: Demonstration of both constructor
 * @author: Mr.wang.sutton
 * @create: 2022-10-17 16:17
 **/
public class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        // Overloaded constructor:
        new Tree();
    }
}

class Tree {
    int height;

    Tree() {
        prt("Planting a seedling");
        height = 0;
    }

    Tree(int i) {
        prt("Creating new Tree that is "
                + i + " feet tall");
        height = i;
    }

    void info() {
        prt("Tree is " + height
                + " feet tall");
    }

    void info(String s) {
        prt(s + ": Tree is "
                + height + " feet tall");
    }

    static void prt(String s) {
        System.out.println(s);
    }
}
```

##### 如何区分重载方法
每个重载的方法都必须采取独一无二的参数类型列表.
```java
    /**
     * 姓名 年级
     * @param name
     * @param age
     */
    public static void print(String name,int age){
        System.out.println("姓名: "+name+"年龄："+age);
    }

    /**
     * 姓名 年级
     * @param name
     * @param age
     */
    public static void print(int age,String name){
        System.out.println("年龄："+age +"姓名: "+name);
    }
```

##### 默认构造器
默认构造器是没有参数的。它们的作用是创建一个“空对象”。若创建一个没有构造器的类，则编译程序会帮我们自动创建一个默认构造器


##### this 关键字
这个很重要,为什么需要this.this 的为了识别不同对象.谁去调用它,this 那么就是指向谁
专业点就是:this关键字（注意只能在方法内部使用）可为已调用了其方法的那个对象生成相应的引用
```java
public class Leaf {
    private int i = 0;

    Leaf increament() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i= " + i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increament().increament().increament().print();
    }
}

```

##### 成员初始化
Java尽自己的全力保证所有变量都能在使用前得到正确的初始化
```java
void f() {
int i;
i++;
}
```

##### 构造器初始化
```java
class Counter {
int i;
Counter() { i = 7; }
// . . .
```

##### 初始化顺序
初始化的顺序是由变量在类内的定义顺序决定的


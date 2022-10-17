# 使用Java运算符
****
加号（+）、减号和负号（-）、乘号（*）、除号（/）以及等号（=）的用法与其他所有编程语言都是类似的.

#### 优先级别
我们只需要知道 () 优先级是符号里面最大的.
~~~ java 
 A = X + Y - 2/2 + Z;
 A = X + (Y - 2)/(2 + Z);
~~~
例子
```java
/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 运算符以一个或多个参数为基础，可生成一个新值。参数采用与原始方法调用不同的一种形式，但效果是相同的
 * @author: Mr.wang.sutton
 * @create: 2022-10-17 11:00
 **/
public class userOperator {

    //结果
    private static double result;

    private static double processResult;

    public static void priority() {
        result=10+3-2/2+3;
        processResult=10+(3-2)/(2+3);
        System.out.println(result);
        System.out.println(processResult);
    }

    public static void main(String[] args) {
            priority();
    }
}

```

##### 赋值
赋值是用等号运算符（=）进行的。它的意思是“取得右边的值，把它复制到左边”
```java
  Number n1 = new Number();
        Number n2 = new Number();
        n1.i = 11;
        n2.i = 47;
        System.out.println("1: n1.i: " + n1.i +
                ", n2.i: " + n2.i);
        n1 = n2;
        System.out.println("2: n1.i: " + n1.i +
                ", n2.i: " + n2.i);
        n1.i = 27;
        System.out.println("3: n1.i: " + n1.i +
                ", n2.i: " + n2.i);
```

算术运算符

---
````java
   // Create a shorthand to save typing:
    static void prt(String s) {
        System.out.println(s);
    }

    // shorthand to print a string and an int:
    static void pInt(String s, int i) {
        prt(s + " = " + i);
    }

    // shorthand to print a string and a float:
    static void pFlt(String s, float f) {
        prt(s + " = " + f);
    }

    public static void main(String[] args) {
        // Create a random number generator,
        // seeds with current time by default:
        Random rand = new Random();
        int i, j, k;
        // '%' limits maximum value to 99:
        j = rand.nextInt() % 100;
        k = rand.nextInt() % 100;
        pInt("j",j);  pInt("k",k);
        i = j + k; pInt("j + k", i);
        i = j - k; pInt("j - k", i);
        i = k / j; pInt("k / j", i);
        i = k * j; pInt("k * j", i);
        i = k % j; pInt("k % j", i);
        j %= k; pInt("j %= k", j);
        // Floating-point number tests:
        float u,v,w;  // applies to doubles, too
        v = rand.nextFloat();
        w = rand.nextFloat();
        pFlt("v", v); pFlt("w", w);
        u = v + w; pFlt("v + w", u);
        u = v - w; pFlt("v - w", u);
        u = v * w; pFlt("v * w", u);
        u = v / w; pFlt("v / w", u);
        // the following also works for
        // char, byte, short, int, long,
        // and double:
        u += v; pFlt("u += v", u);
        u -= v; pFlt("u -= v", u);
        u *= v; pFlt("u *= v", u);
        u /= v; pFlt("u /= v", u);
    }
````
##### 自动递增和递减
递减运算符是--，意为“减少一个单位”；递增运算符是++，意为“增加一个单位”<br />
分两个版本： “前缀版”和“后缀版”
“前递增”表示++运算符位于变量或表达式的前面；而“后递增”表示++运算符位于变量或表达式的后面
<br />
前递增和前递减（如++A或--A），会先执行运算，复用成值。而对于后递增和后递减（如A++或A--），会先生成值，再执行运算
```java
  public static void main(String[] args) {
        int i = 1;
        prt("i : " + i);
//        prt("++i: "+ (++i));
        prt("i++ : " + (i++));// Post-increment
        prt("i : " + i);
        prt("++i :"+(++i));
    }

    static void prt(String s) {
        System.out.println(s);
    }
```
##### 关系运算符
关系运算符生成的是一个“布尔”（Boolean）结果。它们评价的是运算对象值之间的关系。若关系是真实的，关系表达式会生成true（真）；若关系不真实，则生成false（假）。关系运算符包括小于（<）、大于（>）、小于或等于（<=）、大于或等于（>=）、等于（==）以及不等于（!=）。等于和不等于适用于所有内建的数据类型，但其他比较不适用于boolean类型
1. 检查对象是否相等
```java
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
```
##### 逻辑运算符
逻辑运算符AND（&&）、OR（||）以及NOT（!）能生成一个布尔值（true或false）——以参数的逻辑关系为基础

1.短路
操作逻辑运算符时，我们会遇到一种名为“短路”的情况。这意味着只有明确得出整个表达式真或假的结论，才会对表达式进行逻辑求值

2.按位运算符
按位运算符允许我们操作一个整数主数据类型中的单个“比特”，即二进制位
若两个输入位都是1，则按位AND运算符（&）在输出位里生成一个1；否则生成0。若两个输入位里至少有一个是1，则按位OR运算符（|）在输出位里生成一个1；只有在两个输入位都是0的情况下，它才会生成一个0。若两个输入位的某一个是1，但不全都是1，那么按位XOR（^，异或）在输出位里生成一个1。按位NOT（~，也叫作“非”运算符）属于一元运算符；它只对一个参数进行操作（其他所有运算符都是二元运算符）。按位NOT生成与输入位的相反的值——若输入0，则输出1；输入1，则输出0

#### 取反（NOT）

---

取反是一元运算符，对一个二进制数的每一位执行逻辑反操作。使数字1成为0，0成为1。例如：
```java
NOT 0111（十進位7）
  = 1000（十進位8）
------------------------------
NOT 10101011  (十进制 171)
  = 01010100  (十进制 84)
```

#### 按位或（OR）

---
按位或处理两个长度相同的二进制数，两个相应的二进位中只要有一个为1，该位的结果值就为1。
```java
    0101（十进制5）
 OR 0011（十进制3）
  = 0111（十进制7）
```
#### 按位异或（XOR）

----
按位异或运算，对等长二进制模式或二进制数的每一位执行逻辑异或操作。操作的结果是如果某位不同则该位为1，否则该位为0。
```java
    0101
XOR 0011
  = 0110
```
#### 按位与（AND）
按位与处理两个长度相同的二进制数，两个相应的二进位都为1，该位的结果值才为1，否则为0。
```java
    0101
AND 0011
  = 0001
```

3.移位运算符
```java
<<
>>
>>>
```

4.三元 **if-else** 运算符
```java
布尔表达式 ? 值0:值1
```
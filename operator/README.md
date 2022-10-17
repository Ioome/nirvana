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

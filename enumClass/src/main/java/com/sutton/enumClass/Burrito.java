package com.sutton.enumClass;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: switch
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 15:12
 **/
public class Burrito {
    Spiciness degree;

    public Burrito(Spiciness degree) {
        this.degree = degree;
    }

    public void describe() {
        System.out.println("This is byrrito is ");
        switch (degree) {
            case HOT -> System.out.println("not spicy at all");
            case MILD -> System.out.println("MILD");
        }
    }

    public static void main(String[] args) {
        Burrito plain = new Burrito(Spiciness.HOT);
        //1连接方式
        String s1 = "a";
        String s2 = "a";
        String s3 = "a" + s2;
        String s4 = "a" + "a";
        String s5 = s1 + s2;
        //表达式只有常量时，编译期完成计算
        //表达式有变量时，运行期才计算，所以地址不一样
        System.out.println(s3 == s4); //f
        System.out.println(s3 == s5); //f
        System.out.println(s4 == "aa"); //t
        plain.describe();
    }
}

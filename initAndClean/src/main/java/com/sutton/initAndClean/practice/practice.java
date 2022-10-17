package com.sutton.initAndClean.practice;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 练习
 * 用默认构造器创建一个类（没有参数），用它打印一条消息。创建属于这个类的一个对象
 * 在练习1的基础上增加一个重载的构造器，令其采用一个String参数，并随同自己的消息打印出来。
 * @author: Mr.wang.sutton
 * @create: 2022-10-17 19:48
 **/
public class practice {

    public practice() {
        System.out.println("this is my class");
    }

    public practice(String name) {
        System.out.println("hello: " + name);
    }

    public static void main(String[] args) {
        practice practice = new practice();
        practice practice1 = new practice("小王");
        practice[] practices = new practice[2];
        practices[0]=practice;
        practices[1]=practice1;
        for (int i = 0; i < practices.length; i++) {
            System.out.println(practices[i]);
        }
    }
}

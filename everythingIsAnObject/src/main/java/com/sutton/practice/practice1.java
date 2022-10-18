package com.sutton.practice;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 13:10
 **/
public class practice1 {
    int age;

    char name;

    @Override
    public String toString() {
        return "practice1{" +
                "age=" + age +
                ", name=" + name +
                '}';
    }

    public static void main(String[] args) {
        practice1 practice1=new practice1();
        System.out.println(practice1.toString());
    }
}

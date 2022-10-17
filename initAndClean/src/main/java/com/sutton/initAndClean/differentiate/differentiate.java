package com.sutton.initAndClean.differentiate;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 区分重载方法
 * @author: Mr.wang.sutton
 * @create: 2022-10-17 16:20
 **/
public class differentiate {

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


    public static void main(String[] args) {
        print(10,"小红");
        print("小红",30);
    }
}

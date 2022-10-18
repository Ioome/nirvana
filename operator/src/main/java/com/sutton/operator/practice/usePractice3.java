package com.sutton.operator.practice;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 三
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 13:28
 **/
public class usePractice3 {
    float price;

    public static void main(String[] args) {
        usePractice3 usePractice3=new usePractice3();
        usePractice3 usePractice31=new usePractice3();
        usePractice3.price=20.0F;
        usePractice31.price=30.F;
        System.out.println("usePractice3:  "+usePractice3.price+"usePractice31: "+usePractice31);
        usePractice31=usePractice3;
        System.out.println(usePractice31.price);
    }
}

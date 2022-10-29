package com.sutton.ideadebugging;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 异常信息
 * @author: Mr.wang.sutton
 * @create: 2022-10-29 13:20
 **/
public class ThrowDebuging {

    public static void print(){
        System.out.println("hello github");
    }
    public static void main(String[] args) {
       Thread r1=new Thread(new Runnable() {
           @Override
           public void run() {
               System.out.println("hello");
           }
       });
       r1.start();
    }
}

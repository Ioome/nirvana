package com.sutton.initAndClean.simpleConstructor;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 初始化
 * @author: Mr.wang.sutton
 * @create: 2022-10-17 16:10
 **/

class Rock{
    public Rock() {
        System.out.println(".....Rock");
    }

    public Rock(int i){
        System.out.println("Creating Rock number" + i);
    }
}
public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i <1000; i++) {
            new Rock();
            new Rock(i);
        }
    }
}

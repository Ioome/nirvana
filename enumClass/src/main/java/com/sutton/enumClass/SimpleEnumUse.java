package com.sutton.enumClass;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 使用枚举类
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 15:08
 **/
public class SimpleEnumUse {
    public static void main(String[] args) {
        Spiciness spiciness=Spiciness.MILD;
        System.out.println(spiciness);
        for (Spiciness s:Spiciness.values()){
            System.out.println(s+", ordinal "+s.ordinal());
        }
        System.out.println("This burrito is");

    }
}

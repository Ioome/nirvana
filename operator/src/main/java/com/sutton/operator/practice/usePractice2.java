package com.sutton.operator.practice;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 联系2
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 13:24
 **/

class Tank {
    int level;
}

public class usePractice2 {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        System.out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1=t2;
        System.out.println("2: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1.level=27;
        System.out.println("3: t1.level: " + t1.level + ", t2.level: " + t2.level);
    }
}

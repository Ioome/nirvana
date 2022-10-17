package com.sutton.operator;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * 对于前递增和前递减（如++A或--A），会先执行运算，复用成值。而对于后递增和后递减（如A++或A--），会先生成值，再执行运算
 * @author: Mr.wang.sutton
 * @create: 2022-10-17 14:56
 **/
public class useIncreasing {
    public static void main(String[] args) {
        int i = 1;
        prt("i : " + i);
//        prt("++i: "+ (++i));
        prt("i++ : " + (i++));// Post-increment
        prt("i : " + i);
        prt("++i :"+(++i));
    }

    static void prt(String s) {
        System.out.println(s);
    }
}

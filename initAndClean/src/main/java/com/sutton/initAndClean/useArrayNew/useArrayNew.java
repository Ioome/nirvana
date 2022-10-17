package com.sutton.initAndClean.useArrayNew;

import java.util.Random;


/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 数组例子
 * @author: Mr.wang.sutton
 * @create: 2022-10-17 17:54
 **/
public class useArrayNew {

    /**
     * 生成随机数
     */
    static Random rand = new Random();

    /**
     * 参数控制
     * @param mod
     * @return
     */
    static int pRand(int mod) {
        return Math.abs(rand.nextInt()) % mod + 1;
    }

    public static void main(String[] args) {
        /**
         * 随机数组大小
         */
        int[] a;
        a = new int[pRand(20)];
        System.out.println("length of a = " + a.length);
        for(int i = 0; i < a.length; i++)
            prt("a[" + i + "] = " + a[i]);
    }
    static void prt(String s) {
        System.out.println(s);
    }
}

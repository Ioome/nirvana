package com.sutton.initAndClean.useArray;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 数组初始化
 * 数组代表一系列对象或者基本数据类型，所有相同的类型都封装到一起——采用一个统一的标识符名称
 * @author: Mr.wang.sutton
 * @create: 2022-10-17 17:47
 **/
public class useArray {
    public static void main(String[] args) {
        int[] a1={1,2,3,4,5};
        int[] a2;
        a2=a1;
        for (int i=0;i<a2.length;i++)
            a2[i]++;
        for (int i=0;i<a1.length;i++)
            prt("a1[" + i + "] = "+a1[i]);
    }
    static void prt(String s) {
        System.out.println(s);
    }
}

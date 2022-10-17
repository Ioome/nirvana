package com.sutton.initAndClean.useArrayNew;

import java.util.Random;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 多维
 * @author: Mr.wang.sutton
 * @create: 2022-10-17 18:22
 **/
public class MultiDimArray {
    static Random rand = new Random();

    static int pRand(int mod) {
        return Math.abs(rand.nextInt()) % mod + 1;
    }

    public static void main(String[] args) {
        int[][] a1={
                {1,2,3,},
                {4,5,6},
        };
        /**
         *循环
         */
        for (int i=0;i<a1.length;i++){
            for (int j = 0; j <a1[i].length; j++) {
                prt("a1[" + i + "][" + j +
                        "] = " + a1[i][j]);
            }
        }
        /**
         *     // 3-D array with fixed length:
         *     int[][][] a2 = new int[2][2][4];
         */
        int[][][] a2=new int[2][2][4];
        for(int i = 0; i < a2.length; i++)
            for(int j = 0; j < a2[i].length; j++)
                for(int k = 0; k < a2[i][j].length;
                    k++)
                    prt("a2[" + i + "][" +
                            j + "][" + k +
                            "] = " + a2[i][j][k]);
        // 3-D array with varied-length vectors:
        int[][][] a3 = new int[pRand(7)][][];
        for(int i = 0; i < a3.length; i++) {
            a3[i] = new int[pRand(5)][];
            for(int j = 0; j < a3[i].length; j++)
                a3[i][j] = new int[pRand(5)];
        }
    }
    static void prt(String s) {
        System.out.println(s);
    }
}

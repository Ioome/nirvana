package com.sutton.operator.practice;

import java.util.Random;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 抛硬币
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 13:45
 **/
public class usePractice6 {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(2);
        System.out.println("i: " + i);
        int j = 1;
        while (j < 1000) {
            if (i == 0) {
                System.out.println("反面");
            } else if (i == 1) {
                System.out.println("正面");
            }
            continue;
        }
    }
}

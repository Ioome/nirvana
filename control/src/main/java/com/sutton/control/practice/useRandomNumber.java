package com.sutton.control.practice;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 产生 25 个数字
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 14:02
 **/
public class useRandomNumber {

    public static void main(String[] args) {
        /**
         * 随机数
         */
        int[] randomNumber = new int[25];
        /**
         * 产生数字
         */
        for (int i = 0; i < 25; i++) {
            randomNumber[i] = (int) (Math.random() * 100);
        }

        /**
         * 比较大小
         */
        for (int i = 0; i < randomNumber.length - 1; i++) {
            if (randomNumber[i] > randomNumber[i + 1]) {
                System.out.println(randomNumber[i] + "大于" + randomNumber[i + 1]);
            } else if (randomNumber[i] < randomNumber[i + 1]) {
                System.out.println(randomNumber[i] + "小于" + randomNumber[i + 1]);
            } else {
                System.out.println(randomNumber[i] + "等于" + randomNumber[i + 1]);
            }
        }

    }
}

package com.sutton.ideadebugging;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 调试的王
 * @author: Mr.wang.sutton
 * @create: 2022-10-28 20:58
 **/
public class debuging {
    public static void main(String[] args) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (isInterested(random.nextInt(10))) {
                count++;
            }
        }
        System.out.printf("Found %d interested values%n", count);
    }

    private static boolean isInterested(int i) {
        return i % 2 == 0;
    }
}

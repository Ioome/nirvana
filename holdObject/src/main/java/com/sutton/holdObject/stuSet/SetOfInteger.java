package com.sutton.holdObject.stuSet;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-23 10:27
 **/
public class SetOfInteger {
    public static void main(String[] args) {
        Random rand=new Random(47);
        Set<Integer> intset=new HashSet<>();
        for (int i = 0; i <10000; i++) {
            intset.add(rand.nextInt(30));
        }
        System.out.println(intset);
    }
}

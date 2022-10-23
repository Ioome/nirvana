package com.sutton.holdObject.stuQueue;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-23 11:10
 **/
public class usePriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        Random random=new Random(47);
        for (int i = 0; i <10; i++) {
            priorityQueue.offer(random.nextInt(i+3));
        }
        System.out.println(priorityQueue);
        List<Integer> inits= Arrays.asList(25,22,20,18,14,9,3,1,1,12,3,15);
        priorityQueue=new PriorityQueue<>(inits);
        System.out.println(priorityQueue);
    }
}

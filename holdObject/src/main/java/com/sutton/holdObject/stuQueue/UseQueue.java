package com.sutton.holdObject.stuQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-23 11:05
 **/
public class UseQueue {

    public static void printQ(Queue queue){
        while (queue.peek()!=null){
            System.out.println(queue.remove()+"");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        Random rand=new Random(47);
        for (int i = 0; i <10; i++) {
            queue.offer(rand.nextInt(i+10));
        }
        printQ(queue);
        Queue<Character> qc=new LinkedList<>();
        for (char c:"Brantosaurus".toCharArray()){
            qc.offer(c);
        }
        printQ(qc);
    }
}

package com.sutton.holdObject.stuList;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-23 10:14
 **/
public class UseLinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Integer> pets=new LinkedList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(pets);
        System.out.println("pets.getFirst: "+pets.getFirst());
        System.out.println("pets.getLast: "+pets.getLast());
        System.out.println("pets.peek： "+pets.peek());
        System.out.println("pest.remove: "+pets.remove());
        System.out.println("pests.remove: "+pets.removeFirst());
        System.out.println("pests.poll: "+pets.poll());
        System.out.println(pets);
        pets.addFirst(Integer.valueOf(1));
        System.out.println(pets);
        System.out.println(pets.offer(1));
        System.out.println(pets);
    }
}

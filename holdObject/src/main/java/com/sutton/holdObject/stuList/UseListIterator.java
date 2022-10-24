package com.sutton.holdObject.stuList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-23 10:10
 **/
public class UseListIterator {
    public static void main(String[] args) {
        List<Integer> number=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        ListIterator listIterator=number.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next()+", "+listIterator.nextIndex()+", "+ listIterator.previousIndex()+"; ");
        }
        System.out.println();
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous().toString()+" ");
        }
        System.out.println();
        System.out.println(number);

    }
}

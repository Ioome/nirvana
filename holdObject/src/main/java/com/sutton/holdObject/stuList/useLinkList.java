package com.sutton.holdObject.stuList;

import java.util.LinkedList;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 链表
 * @author: Mr.wang.sutton
 * @create: 2022-10-20 21:28
 **/
public class useLinkList {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.addFirst("first");
        cars.remove(0);
        cars.remove();
        System.out.println(cars);

    }
}

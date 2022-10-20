package com.sutton.holdObject.stuSet;

import java.util.HashSet;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-20 21:44
 **/
public class useHashSet {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Mazda");
        System.out.println(cars.contains("Mazda"));
        System.out.println(cars.remove("Volvo"));
        System.out.println(cars.size());
        cars.clear();
        System.out.println(cars);
    }
}

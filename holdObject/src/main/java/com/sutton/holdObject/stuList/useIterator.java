package com.sutton.holdObject.stuList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 使用迭代器
 * @author: Mr.wang.sutton
 * @create: 2022-10-20 21:48
 **/
public class useIterator {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        printArrayList(cars);
    }

    /**
     * 遍历 ArrayList
     *
     * @param list
     */
    public static void printArrayList(List list) {

        //正则表达式
        String pattern = "B";

        //获取迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String name = it.next();
            boolean isMatch = Pattern.matches(pattern, name);
            if (isMatch) {
                it.remove();
            }
        }
        System.out.println(list.toString());
    }
}

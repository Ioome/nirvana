package com.sutton.holdObject.stuList;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: ListRemove
 * @author: Mr.wang.sutton
 * @create: 2022-10-21 10:37
 **/
public class useListRemove {
    public static void main(String[] args) {
        System.out.println("测试remove包装类型和非包装类型");
        ArrayList<Integer> myList = new ArrayList<Integer>();
        for (int k = 0; k < 10; k++) {
            myList.add((k + 1) * 10);
        }
        System.out.println("myList:" + myList);

        // remove(8) 是删掉下标为8的元素
        System.out.println(String.format("%s:%s myList:%s", "remove(8)", myList.remove(8), myList));
        myList.set(myList.indexOf(80), 8);
        System.out.println(myList);
        Collections.shuffle(myList);
        System.out.println(myList);
    }
}

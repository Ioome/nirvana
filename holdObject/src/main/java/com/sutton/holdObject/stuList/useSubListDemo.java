package com.sutton.holdObject.stuList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 使用不当引起死循环
 * @author: Mr.wang.sutton
 * @create: 2022-10-21 00:23
 **/
public class useSubListDemo {
    public static void main(String[] args) {
        List<Long> arrayList = init();
        List<Long> subList = arrayList.subList(0, 1);
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.size());
//            if (arrayList.get(i) % 2 == 0) {
//                subList.add(arrayList.get(i));
//            }
//        }
        int i=0;
        while (i<arrayList.size())
        {
            System.out.println(arrayList.size());
            if (arrayList.get(i) % 2 == 0) {
                subList.add(arrayList.get(i));
            }
            i++;
        }
    }
    private static List<Long> init() {
        Random random=new Random(10);
        List<Long> arrayList = new ArrayList<>();
        arrayList.add(random.nextLong());
        arrayList.add(random.nextLong());
        arrayList.add(random.nextLong());
        arrayList.add(random.nextLong());
        arrayList.add(random.nextLong());
        return arrayList;
    }
}

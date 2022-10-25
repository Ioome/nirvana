package com.sutton.util.collections.find;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 查找
 * @author: Mr.wang.sutton
 * @create: 2022-10-25 10:00
 **/
public class useCollectionFind {

    public static void useCollectionFindApi() {
        List<String> list = new ArrayList<>();
        list.add("沉默王二");
        list.add("沉默王三");
        list.add("沉默王四");
        list.add("沉默王五");
        list.add("沉默王六");

        System.out.println("最大元素: " + Collections.max(list));
        System.out.println("最小元素: " + Collections.min(list));

        //没有排序直接调用二分查找，结果是不确定的
        System.out.println("排序前的二分查找结果: " + Collections.binarySearch(list, "沉默王二"));
        Collections.sort(list);
        //排序后
        System.out.println("排序前的二分查找结果: " + Collections.binarySearch(list, "沉默王二"));

        Collections.fill(list, "沉默王八");
        System.out.println("填充后的结果: " + list);


    }



    public static void main(String[] args) {
        useCollectionFindApi();
    }
}

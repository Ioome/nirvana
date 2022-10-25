package com.sutton.util.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 排序操作
 * @author: Mr.wang.sutton
 * @create: 2022-10-25 09:54
 **/
public class useCollectionsSort {
    public static void useCollectionsSort() {
        List<String> list = new ArrayList<>();
        list.add("沉默王二");
        list.add("沉默王三");
        list.add("沉默王四");
        list.add("沉默王五");
        list.add("沉默王六");

        System.out.println("原始顺序: " + list);

        //反转
        Collections.reverse(list);
        System.out.println("反转后: " + list);

        //洗牌
        Collections.shuffle(list);
        System.out.println("洗牌后: " + list);

        //自然升序
        Collections.sort(list);
        System.out.println("自然升序： " + list);

        //交换
        Collections.swap(list, 2, 4);
        System.out.println("自然交换： " + list);
    }

    public static void main(String[] args) {
        useCollectionsSort();
    }
}

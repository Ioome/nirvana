package com.sutton.holdObject.stuList;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 类型转换
 * @author: Mr.wang.sutton
 * @create: 2022-10-21 10:29
 **/
public class UseAdapterArrayList {
    public static void main(String[] args) {
        print();

    }

    public static void errotPrint() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(0);
        integerList.add(1);
        integerList.add(2);
        List<Integer> subList = integerList.subList(0, 1);

        ArrayList<Integer> castList = (ArrayList<Integer>) subList;
    }

    public static void print() {
        //产生一个 ArrayList
        List<String> stringList = new ArrayList<>();
        stringList.add("hello");
        stringList.add("my");
        stringList.add("JAVA");
        stringList.add("world");
        stringList.add("!!!!");
        stringList.add("sutton");
        stringList.add("......");

        //打印所有内容
        System.out.println(stringList.toString());
        //取出子列表
        List<String> subList = stringList.subList(2, 4);
        //打印
        System.out.println("子列表：" + subList.toString());
        //大小
        System.out.println("子列表长度：" + subList.size());

        //我们们修改子列表吧！！！！
        subList.set(1, "周星星");
        System.out.println("子列表：" + subList.toString());
        //打印原数组 哇！！！！
        System.out.println("原始列表：" + stringList.toString());
    }
}

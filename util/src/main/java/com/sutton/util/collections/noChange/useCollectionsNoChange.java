package com.sutton.util.collections.noChange;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-25 10:14
 **/
public class useCollectionsNoChange {

    public static  void  useCollectionsNoChange(){
        List emptyList = Collections.emptyList();
        emptyList.add("非空");
        System.out.println(emptyList);
    }

    public static void useCollectionOther(){
        List<String> allList = new ArrayList<>();
        List<String> list = new ArrayList<>();
        list.add("沉默王二");
        list.add("沉默王三");
        list.add("沉默王四");
        list.add("沉默王五");
        list.add("沉默王六");

        Collections.addAll(allList,"沉默王九","沉默王六");
        System.out.println("addAll 后：" + allList);

        System.out.println("是否没有交集：" + (Collections.disjoint(list, allList) ? "是" : "否"));
    }
    public static void main(String[] args) {
//        useCollectionsNoChange();
        useCollectionOther();
    }
}

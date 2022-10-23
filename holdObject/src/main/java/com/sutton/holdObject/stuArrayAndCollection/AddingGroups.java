package com.sutton.holdObject.stuArrayAndCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-22 23:12
 **/
public class AddingGroups {
    public static void main(String[] args) {
        //第一种方法
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        //第二种
        Integer[] moreInts = {6, 7, 8, 9, 10};
        collection.addAll(Arrays.asList(moreInts));

        //第三
        Collections.addAll(collection, 11, 12, 13, 14, 15);

        //第四
        Collections.addAll(collection, moreInts);

        //第五
        List<Integer> list = Arrays.asList(16, 17, 18, 19);

        list.set(1, 99);


    }
}

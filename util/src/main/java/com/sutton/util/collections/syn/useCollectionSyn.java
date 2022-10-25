package com.sutton.util.collections.syn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 返回同步对象
 * @author: Mr.wang.sutton
 * @create: 2022-10-25 10:09
 **/
public class useCollectionSyn {

    public  static void useCollectionSynChronized(){
        List<String> list = new ArrayList<>();
        list.add("沉默王二");
        list.add("沉默王三");
        list.add("沉默王四");
        list.add("沉默王五");
        list.add("沉默王六");

        List<String> synchronizedList = Collections.synchronizedList(list);

    }
}

package com.sutton.holdObject.stuList;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 增加
 * @author: Mr.wang.sutton
 * @create: 2022-10-21 09:59
 **/
public class useArrayListAdd {
    public static void main(String[] args) {
        List<String> listArr = new ArrayList<>();
        listArr.add("Delhi");
        listArr.add("Bangalore");
        listArr.add("New York");
        listArr.add("London");
        System.out.println(listArr.get(0));

        ArrayList<String>listArrSub = (ArrayList<String>) listArr.subList(1, 3);

        System.out.println("List-: " + listArr);
        System.out.println("Sub List-: " + listArrSub);

        //Performing Structural Change in list.
        listArr.add("Mumbai");

        System.out.println("nAfter Structural Change...n");

        System.out.println("List-: " + listArr);
        System.out.println("Sub List-: " + listArrSub);
    }
}

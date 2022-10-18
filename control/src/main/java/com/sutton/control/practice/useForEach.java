package com.sutton.control.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 使用 Foreach
 * 使用 foreach
 *  for(Iterator i$ = a.iterator(); i$.hasNext(); System.out.print(temp)){
 *     temp = (String)i$.next();
 * }
 *
 * String arr[] = { "1", "2"  };
 *   String arr$[] = arr;
 *   int len$ = arr$.length;
 *   for(int i$ = 0; i$ < len$; i$++)
 *   {
 *       String e = arr$[i$];
 *       System.out.println(e);
 *   }
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 14:23
 **/
public class useForEach {

    public static void main(String[] args) {
        List<String> list;
        list = new ArrayList<String>();
        for (String e : list) {
            list.add("1");
        }
    }
}

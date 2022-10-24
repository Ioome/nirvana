package com.sutton.holdObject.stuMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 使用哈希树
 * @author: Mr.wang.sutton
 * @create: 2022-10-20 21:38
 **/
public class UseHashMap {
    public static void main(String[] args) {
        Map<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "jordan");
        capitalCities.put("USA", "Kobe");
        capitalCities.put("china", "yao");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "YY");
        System.out.println(capitalCities);
        System.out.println(capitalCities.get("USA"));
        System.out.println(capitalCities.remove("England"));
        System.out.println(capitalCities);
        //打印
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        for (String i : capitalCities.values()) {
            System.out.println(i);
        }
        for (String i : capitalCities.keySet()) {
            System.out.println("key:  " + i + "value:" + capitalCities.get(i));
        }

    }
}

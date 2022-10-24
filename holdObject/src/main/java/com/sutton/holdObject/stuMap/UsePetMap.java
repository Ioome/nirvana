package com.sutton.holdObject.stuMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-23 10:42
 **/
public class UsePetMap {
    public static void main(String[] args) {
        Map<String,Integer> petMap=new HashMap<>();
        petMap.put("May cat",Integer.valueOf(1));
        petMap.put("May dog",Integer.valueOf(2));
        petMap.put("May brid",Integer.valueOf(3));
        System.out.println(petMap);
        Integer dog=petMap.get("May dog");
        System.out.println(dog);
        System.out.println(petMap.containsKey("May dog"));
        System.out.println(petMap.containsValue(2));


    }
}

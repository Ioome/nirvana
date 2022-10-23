package com.sutton.holdObject.stuMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-23 10:45
 **/
public class useMapOfList {
    public static void main(String[] args) {
        Map<String, List<? extends Integer>> petPeople = new HashMap<>();
        petPeople.put("小黑", Arrays.asList(1,2));
        petPeople.put("小白", Arrays.asList(1,3));
        petPeople.put("小红", Arrays.asList(1,5));
        System.out.println("People: "+petPeople.keySet());
        System.out.println("value: "+petPeople.values());
        for (String s:petPeople.keySet()){
            System.out.println(s + " has: ");
            for (Integer animal:petPeople.get(s)){
                System.out.println(animal);
            }
        }

    }
}

package com.sutton.holdObject.stuMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-23 10:39
 **/
public class stuStatistics {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < 1000000; i++) {
            //产生键
            int r = rand.nextInt(100);
            //根据键获取
            Integer req = m.get(r);
            //put 键,递增值
            m.put(r, req == null?1:req+1);
        }
        System.out.println(m);

    }
}

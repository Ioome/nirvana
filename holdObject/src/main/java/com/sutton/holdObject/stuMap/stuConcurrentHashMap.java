package com.sutton.holdObject.stuMap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: map
 * @author: Mr.wang.sutton
 * @create: 2022-10-17 10:12
 **/
public class stuConcurrentHashMap {
    /**
     * Map 的扩容比较消耗性能, 因此若能确定存储数据的大小,
     * 在初始化时指定初始容量是一个不错的实践技巧
     */
    private static Map<String, Integer> map = new ConcurrentHashMap<>(16);


    /**
     * 设置 map Value
     */
    public static  void putMap(){
            map.put("小红",20);
            map.put("小黑",30);
    }


    /**
     * 获取key
     */
    public static void usedKeySet(){
            for (String key : map.keySet()) {
                System.out.println(key);
            }
    }


    /**
     * 获取 value
     */
    public static void usedValues() {
        for (Integer value : map.values()) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        putMap();
        usedKeySet();
        usedValues();
    }
}

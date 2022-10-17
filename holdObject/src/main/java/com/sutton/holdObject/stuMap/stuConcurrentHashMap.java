package com.sutton.holdObject.stuMap;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: map
 * foreach 的操作虽然看起来很简洁, 但有一个劣势: 遍历 Map 时, 如果改变其大小, 就会抛出并发修改异常. 但如果在遍历时只需要删除 Map 中的元素, 那就可以用 Iterator 的 remove() 方法删除元素
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

    /**
     * 获取到 key 的值再去通过 key 去查找 value
     */
    public static void useKeySetAndGetKey() {
        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
    }


    /**
     * 使用 Entry 的方式去遍历,先获取到 entry方法.
     */
   public static  void useEntry(){
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
   }

    /**
     * 使用迭代器.
     */
    public static  void useIterator() {
        Iterator<Map.Entry<String, Integer>> it=map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
            // 删除元素
            // it.remove();
        }
     }


     public static void useLambda(){
        map.forEach((key,value)->{
            System.out.println(key+":"+value);
        });
     }


    public static void main(String[] args) {
    }
}

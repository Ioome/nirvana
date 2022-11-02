package org.example.hashmapiteration;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: Hash 7 种迭代
 * @author: Mr.wang.sutton
 * @create: 2022-11-02 10:23
 **/
public class iterationUtil {
    /**
     * 今天的主角
     */
    Map<Integer, String> map = new HashMap();

    /**
     * set
     *
     * @param map 对象调用
     */
    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    /**
     * 赋值操作
     */
    public void assignment() {
        map.put(1, "Java");
        map.put(2, "JDK");
        map.put(3, "Spring Framework");
        map.put(4, "MyBatis framework");
        map.put(5, "Java中文社群");
    }

    /**
     * @return 返回此对象迭代器
     */
    public Iterator<Map.Entry<Integer, String>> getIterator() {
        return map.entrySet().iterator();
    }

    /**
     * 使用迭代器（Iterator）EntrySet 的方式进行遍历；
     */
    public void useEntrySet() {
        /**
         * 相当于获取了一个HashMap 元素，并且  Iterator 指向了 它.
         */
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    /**
     * 使用迭代器（Iterator）KeySet 的方式进行遍历；
     * 此方法是获取 key 的方式,
     */
    public void useKeySet() {
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println(key);
            System.out.println(map.get(key));
        }
    }

    /**
     * 使用 For Each EntrySet 的方式进行遍历
     * 原理也是通过获取 hash 元素去处理
     */
    public void useForEach() {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    /**
     * 使用 For Each KeySet 的方式进行遍历；
     * 获取到 key
     */
    public void useForEachEntryKey() {
        for (Integer key : map.keySet()) {
            System.out.println(key);
            System.out.println(map.get(key));
        }
    }

    /**
     * 使用 Lambda 表达式的方式进行遍历；
     */
    public void useLambda() {
        map.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);
        });
    }

    /**
     * 使用流
     */
    public void useStream() {
        map.entrySet().stream().forEach((entry) -> {
            System.out.println(entry.getValue());
            System.out.println(entry.getKey());
        });
    }

    //    使用 Streams API 单线程的方式进行遍历；
    //    使用 Streams API 多线程的方式进行遍历。
    public static void main(String[] args) {
        iterationUtil util = new iterationUtil();
        util.assignment();
        util.useStream();
    }
}

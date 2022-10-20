package com.suttom.Concurrency.find;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: find
 * @author: Mr.wang.sutton
 * @create: 2022-10-20 09:02
 **/
public class find {
    public static void main(String[] args) {
        String path = find.class.getResource("/").toString();
        System.out.println("path = " + path);
    }
}

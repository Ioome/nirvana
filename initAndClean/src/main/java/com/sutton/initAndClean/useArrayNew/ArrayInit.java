package com.sutton.initAndClean.useArrayNew;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: //: ArrayInit.java
 * @author: Mr.wang.sutton
 * @create: 2022-10-17 17:59
 **/
public class ArrayInit {
    public static void main(String[] args) {
        Integer[] a = {new Integer(1), new Integer(2), new Integer(3)};

        // Java 1.1 only:
        Integer[] b = new Integer[]{
                new Integer(1),
                new Integer(2),
                new Integer(3),
        };
    }
}

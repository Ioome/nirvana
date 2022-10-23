package com.sutton.inner.DotNew;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-22 00:10
 **/
public class DotNew {
    public class Inner {
    }

    public static void main(String[] args) {
        DotNew dotNew = new DotNew();
        DotNew.Inner inner = dotNew.new Inner();
        System.out.println(inner);
    }
}

package com.sutton.initAndClean.useThis;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 香蕉
 * @author: Mr.wang.sutton
 * @create: 2022-10-17 16:27
 **/
public class Banana {

    void f() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        Banana a = new Banana(), b = new Banana();
        a.f();
        b.f();
    }
}

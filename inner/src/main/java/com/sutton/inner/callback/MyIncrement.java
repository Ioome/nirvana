package com.sutton.inner.callback;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-22 20:23
 **/
public class MyIncrement {
    public void  increment(){
        System.out.println("Other Operation");
    }

    static void f(MyIncrement  mi){
        mi.increment();
    }
}

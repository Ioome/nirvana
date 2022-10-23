package com.sutton.inner.callback;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-22 20:29
 **/
public class Callbacks {
    public static void main(String[] args) {
        Calleel c1=new Calleel();
        Callee2 c2=new Callee2();
        MyIncrement.f(c2);
        Caller caller1=new Caller(c1);
        Caller caller2=new Caller(c2.getCallbackReference());
        caller1.go();
        caller1.go();
        caller1.go();
    }
}

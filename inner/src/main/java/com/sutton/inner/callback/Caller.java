package com.sutton.inner.callback;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-22 20:27
 **/
public class Caller {
    private Incrementable callbackReference;

    Caller(Incrementable incrementable) {
        callbackReference = incrementable;
    }

    void go() {
        callbackReference.increment();
    }
}

package com.sutton.inner.callback;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 *      回调的接口
 * @author: Mr.wang.sutton
 * @create: 2022-10-22 20:22
 **/
public class Calleel implements Incrementable {

    private int i = 0;

    /**
     *
     */
    @Override
    public void increment() {
        i++;
        System.out.println(i);
    }
}

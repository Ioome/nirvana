package com.sutton.inner.Example;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-22 00:14
 **/
public class Example {

    private class InsideClass implements Incrementable {

        /**
         *
         */
        @Override
        public void increment() {
            System.out.println("这是一个测试");
        }


    }

    public Incrementable getIn() {
        return new InsideClass();
    }

    public static void main(String[] args) {
        Example e = new Example();
        Incrementable a1 = e.getIn();
        a1.increment();
    }
}

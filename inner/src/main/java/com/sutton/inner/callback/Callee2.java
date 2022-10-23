package com.sutton.inner.callback;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-22 20:24
 **/
public class Callee2 extends MyIncrement {

    private int i = 0;

    public void increment() {
        super.increment();
        i++;
        System.out.println(i);
    }

    private class Closure implements Incrementable {

        /**
         *
         */
        @Override
        public void increment() {
            Callee2.this.increment();
        }

    }

    Incrementable getCallbackReference() {
        return new Closure();
    }
}

package com.sutton.inner.Dothis;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-22 00:00
 **/
public class DoThis {
    void f() {
        System.out.println("Dothid.f()");
    }


    //返回外部类引用
    public class Inner {
        public DoThis outer() {
            System.out.println(DoThis.this);
            return DoThis.this;
        }
    }

    //返回内部类引用
    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DoThis doThis = new DoThis();
        DoThis doThis1 = new DoThis();
        DoThis.Inner dti1 = doThis1.inner();
        dti1.outer().f();
        DoThis.Inner dti = doThis.inner();
        dti.outer().f();
    }
}

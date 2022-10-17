package com.sutton.initAndClean.useArrayNew;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: VarArgs
 * @author: Mr.wang.sutton
 * @create: 2022-10-17 18:00
 **/

class A { int i; }
public class VarArgs {
    static void f(Object[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

    public static void main(String[] args) {
        f(new Object[]{new Integer(47),new Float(3.14), new Double(11.11) });
    }
}

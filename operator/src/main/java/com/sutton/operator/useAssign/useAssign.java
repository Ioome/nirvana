package com.sutton.operator.useAssign;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 赋值
 * @author: Mr.wang.sutton
 * @create: 2022-10-17 11:19
 **/



class Number {
    int i;

}

public class useAssign {
    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();
        n1.i = 11;
        n2.i = 47;
        System.out.println("1: n1.i: " + n1.i +
                ", n2.i: " + n2.i);
        n1 = n2;
        System.out.println("2: n1.i: " + n1.i +
                ", n2.i: " + n2.i);
        n1.i = 27;
        System.out.println("3: n1.i: " + n1.i +
                ", n2.i: " + n2.i);
    }

}

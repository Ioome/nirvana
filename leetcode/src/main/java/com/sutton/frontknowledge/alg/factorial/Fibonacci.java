package com.sutton.frontknowledge.alg.factorial;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 费纳波数列
 * 通过递归去解决
 * @author: Mr.wang.sutton
 * @create: 2022-10-28 20:23
 **/
public class Fibonacci {

    public static int fibonacciMethod(int index) {
        if (index == 1 || index == 2) {
            return 1;
        }
        return fibonacciMethod(index - 1) + fibonacciMethod(index - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacciMethod(10));
    }
}

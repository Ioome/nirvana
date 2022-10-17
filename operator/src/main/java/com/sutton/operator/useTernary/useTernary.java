package com.sutton.operator.useTernary;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 三元运算符
 * @author: Mr.wang.sutton
 * @create: 2022-10-17 15:53
 **/
public class useTernary {
    /**
     * 练习
     * @param i
     * @return
     */
    static int ternary(int i) {
        return i < 10 ? i * 100 : i * 10;
    }

    public static void main(String[] args) {
        System.out.println(ternary(100));
    }
}

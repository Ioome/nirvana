package com.sutton.initAndClean.useThis;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 叶子
 * @author: Mr.wang.sutton
 * @create: 2022-10-17 16:36
 **/
public class Leaf {
    private int i = 0;

    Leaf increament() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i= " + i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increament().increament().increament().print();
    }
}

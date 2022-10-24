package com.sutton.control.practice;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 静态
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 14:55
 **/

class Bowl {
    Bowl(int market) {
        System.out.println("Bowl(" + market + ")");
    }

    void f1(int market) {
        System.out.println("f1(" + market + ")");
    }
}

class Table {
    static Bowl bowl = new Bowl(1);

    Table() {
        System.out.println("Table()");
        bowl.f1(1);
    }

    void f2(int market) {
        System.out.println("f2(" + market + ")");
    }

    static Bowl bowl2 = new Bowl(2);
}

class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);

    static {
        System.out.println("最先初始化");
    }
    Cupboard() {
        System.out.println("cupBoard");
        bowl4.f1(2);
    }

    void f3(int market) {
        System.out.println("f3(" + market + ")");
    }

    static Bowl bowl5 = new Bowl(5);
}

public class UseStaticInitialization {
    public static void main(String[] args) {
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();
    }
}

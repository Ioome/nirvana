package com.sutton.polymorphism.FieldAccess;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-19 10:47
 **/

class Super {
    public int field = 0;
    public List<String> stringList = new ArrayList<>();

    public int getField() {
        return field;
    }
}

class Sub extends Super {
    public int field = 1;

    @Override
    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }
}

public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();
        System.out.println(sup.getField());
        System.out.println(sup.field);
    }
}

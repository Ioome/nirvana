package com.sutton.inner.Parcell;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * 作业
 * @author: Mr.wang.sutton
 * @create: 2022-10-21 23:24
 **/
public class Outer {


    class Inner {
        String name;

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Inner{" +
                    "name='" + name + '\'' +
                    '}';
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner o = outer.getInner();
        o.setName("jos");
        System.out.println(o.getName());


    }
}

package com.sutton.inner.Parcell;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 内部类
 * @author: Mr.wang.sutton
 * @create: 2022-10-21 23:10
 **/
public class Parcell {


    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        public Destination(String label) {
            this.label = label;
        }

        /**
         * 读label
         *
         * @return
         */
        String readLabel() {
            return label;
        }
    }

    public void ship(String dest) {
        Contents contents = new Contents();
        System.out.println(contents.i);
        Destination destination = new Destination(dest);
        System.out.println(destination.readLabel());
    }

    //Using inner classes look just like
    //using any other class,within Parcell
    public static void main(String[] args) {
        Parcell parcell = new Parcell();
        parcell.ship("Tasmania");
    }
}

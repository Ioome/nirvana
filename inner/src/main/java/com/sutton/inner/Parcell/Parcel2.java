package com.sutton.inner.Parcell;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: parcel
 *  基本使用，先了解了一下语法。
 * @author: Mr.wang.sutton
 * @create: 2022-10-21 23:18
 **/
public class Parcel2 {

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

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents contents() {
        return new Contents();
    }

    public static void main(String[] args) {
        Parcel2 p=new Parcel2();
        p.ship("Tasmania");
        Parcel2 q=new Parcel2();
        Parcel2.Contents c=q.contents();
        Parcel2.Destination d=q.to("Borneo");

    }

}

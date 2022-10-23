package com.sutton.inner.Parcell;

import java.util.SortedMap;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-22 00:31
 **/
public class Parcel5 {

    public Destination destination(String s) {
        class Pdestination implements Destination {
            private String label;

            public Pdestination(String label) {
                this.label = label;
            }

            /**
             * @return
             */
            @Override
            public String readLabel() {
                return "hello";
            }
        }
        return new Pdestination(s);
    }

    public static void main(String[] args) {
        Parcel5 parcel5 = new Parcel5();
        Destination p=parcel5.destination("100");
        System.out.println(p.readLabel());
    }
}

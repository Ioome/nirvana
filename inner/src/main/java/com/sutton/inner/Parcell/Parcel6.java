package com.sutton.inner.Parcell;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-11-04 10:16
 **/
public class Parcel6 {
    private Destination destination(String s) {
        class PDestination implements Destination {
            String label;

            public PDestination(String whereTo) {
                label = whereTo;
            }

            /**
             * @return
             */
            @Override
            public String readLabel() {
                return label;
            }
        }

        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel6 parcel6 = new Parcel6();
        Destination destination = parcel6.destination("China");
        System.out.println(destination.readLabel());
    }

}

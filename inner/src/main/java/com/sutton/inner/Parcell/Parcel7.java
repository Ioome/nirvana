package com.sutton.inner.Parcell;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-22 10:11
 **/
public class Parcel7 {
    public Contents contents() {
        return new Contents() {
            private int i = 11;

            @Override
            public int value() {
                return 11;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 parcel7=new Parcel7();
        System.out.println(parcel7.contents().value());
    }
}

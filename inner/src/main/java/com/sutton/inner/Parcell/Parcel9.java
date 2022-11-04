package com.sutton.inner.Parcell;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-11-04 10:25
 **/
public class Parcel9 {
    private ContentsAnonymous contents() {
        return new ContentsAnonymous() {
            private int value = 11;

            @Override
            public int getValue() {
                return value;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 parcel9 = new Parcel9();
        System.out.println(parcel9.contents().getValue());
    }

}

package com.sutton.inner.Parcell;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-11-04 10:28
 **/
public class Parcel9b {
    private class MyContents implements ContentsAnonymous {

        private int value = 11;

        /**
         * @return
         */
        @Override
        public int getValue() {
            return value;
        }
    }

    public ContentsAnonymous contents() {
        return new MyContents();
    }

    public static void main(String[] args) {
        Parcel9b parcel9b = new Parcel9b();
        parcel9b.contents().getValue();
    }
}

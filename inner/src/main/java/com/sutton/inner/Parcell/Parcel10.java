package com.sutton.inner.Parcell;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-11-04 10:31
 **/
public class Parcel10 {
    private WithArgsConstructor withArgsConstructor(int x) {
        return new WithArgsConstructor(x) {
            /**
             * @return
             */
            @Override
            public int sumAll() {
                return super.sumAll();
            }
        };
    }
}

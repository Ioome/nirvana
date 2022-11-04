package com.sutton.inner.Parcell;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-11-04 10:21
 **/
public class Parcel8 {
    // 吃椰子的方法
    private void eatCoconut(boolean flag) {
        if (flag) {
            class Cocount {
                private String pipe;

                public Cocount(String pipe) {
                    this.pipe = pipe;
                }

                // 喝椰子汁的方法
                String drinkCoconutJuice() {
                    System.out.println("喝椰子汁");
                    return pipe;
                }
            }
            // 提供一个吸管，可以喝椰子汁
            Cocount coconut = new Cocount("用吸管喝");
            coconut.drinkCoconutJuice();
        }
    }

    public static void main(String[] args) {
        Parcel8 parcel8 = new Parcel8();
        parcel8.eatCoconut(true);
    }
}

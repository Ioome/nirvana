package com.sutton.polymorphism;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 风琴
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 21:21
 **/
public class Wind extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Wind.plau1" + n);
    }

    @Override
    String what() {
        return "Wind";
    }

    @Override
    void adjust() {
        System.out.println("Adjust Persussion");
    }
}

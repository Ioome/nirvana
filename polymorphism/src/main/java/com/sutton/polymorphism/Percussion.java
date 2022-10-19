package com.sutton.polymorphism;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-19 10:28
 **/
public class Percussion extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Percussion.play" + n);
    }

    @Override
    String what() {
        return "percussion";
    }

    @Override
    void adjust() {
        System.out.println("adjust");
    }
}

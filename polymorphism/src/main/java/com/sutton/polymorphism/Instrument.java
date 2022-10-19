package com.sutton.polymorphism;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 乐器
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 21:20
 **/
public class Instrument {

    public void play(Note n) {
        System.out.println("Instrument.play()");
    }

    String what() {
        return "wind";
    }

    void adjust() {
        System.out.println("Adjusting  Percussion;");
    }
}

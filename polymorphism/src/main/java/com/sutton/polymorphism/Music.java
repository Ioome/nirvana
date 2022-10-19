package com.sutton.polymorphism;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 音乐
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 21:23
 **/
public class Music {


    public static void tune(Instrument instrument) {
        instrument.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind wind=new Wind();
        tune(wind);
    }
}

package com.sutton.Reuse.Wind;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 乐器
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 20:22
 **/
public class Instrument {
    public void play() {

    }

    static void tune(Instrument i) {
        //...
        i.play();
    }
}

class Wind extends Instrument {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute);
    }
}

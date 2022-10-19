package com.sutton.Reuse.Cartoon;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: Constructor calls during   inheritance
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 19:20
 **/

class Art {
    public Art() {
        System.out.println("Art Constructore");
    }
}

class Drawing extends Art {
    public Drawing() {
        System.out.println("Drawing Constructor");
    }
}

public class Catoon extends Drawing {
    public Catoon() {
        System.out.println("Cartoon Constructor");
    }

    public static void main(String[] args) {
        Catoon x = new Catoon();
    }
}

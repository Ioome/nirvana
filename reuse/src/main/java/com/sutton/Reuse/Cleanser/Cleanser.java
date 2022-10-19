package com.sutton.Reuse.Cleanser;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: Inheritance sysntax & properties
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 17:59
 **/
public class Cleanser {

    /**
     * 字符串
     */
    private String s = "Cleanser";


    /**
     * 再尾部增加东西
     *
     * @param a
     * @deprecated 循环调用将产生无数个对象
     */
    public void append(String a) {
        s += a;
    }

    /**
     * 增加
     */
    public void dilute() {
        append("dilute()");
    }

    /**
     * apply
     *
     * @return
     */
    public void apply() {
        append("apply()");
    }

    /**
     * scrub
     */
    public void scrub() {
        append("scrub()");
    }

    @Override
    public String toString() {
        return "Cleanser{" +
                "s='" + s + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Cleanser cleanser = new Cleanser();
        cleanser.dilute();
        cleanser.apply();
        cleanser.scrub();
        System.out.println(cleanser);
    }
}

class Detergent extends Cleanser {

    /**
     * 增加
     */
    @Override
    public void dilute() {
        super.dilute();
    }

    //change a method
    public void scrub() {
        append("scrub()");
        super.scrub();
    }

    public void foam() {
        append("foam");
    }

    public static void main(String[] args) {
        Detergent detergent = new Detergent();
        detergent.dilute();
        detergent.apply();
        detergent.scrub();
        detergent.foam();
        System.out.println(detergent);
        System.out.println("Testing  base class:");
        Cleanser.main(args);
    }
}

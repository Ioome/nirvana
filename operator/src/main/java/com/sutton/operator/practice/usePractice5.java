package com.sutton.operator.practice;

import javax.swing.*;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 练习6
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 13:40
 **/
public class usePractice5 {

    public static void main(String[] args) {
        Dog spot = new Dog("spot", "Ruff");
        Dog scruffy = new Dog("scruffy", "Wurf");
        System.out.println(spot.toString());
        System.out.println(scruffy.toString());
        Dog copySpot=spot;
        System.out.println(copySpot==spot);
        System.out.println(copySpot.equals(spot));
    }
}

class Dog {
    private String name;

    private String say;

    public Dog(String name, String say) {
        this.name = name;
        this.say = say;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", say='" + say + '\'' +
                '}';
    }
}

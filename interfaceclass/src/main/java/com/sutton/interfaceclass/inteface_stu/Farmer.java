package com.sutton.interfaceclass.inteface_stu;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 农夫
 * @author: Mr.wang.sutton
 * @create: 2022-10-20 15:18
 **/
public class Farmer {
    public void bringWater(String destination) {
        System.out.println("Farmer bring water to " + destination + ".");
    }

    public void bringAnimal(Animal a, String destination) {
        System.out.println("Farmer bring " + a.getName() + " to " + destination + ".");
    }

    public void feedWater(Animal a) { // polymorphism
        this.bringWater("Feeding Room");
        a.move("Feeding Room");
        a.drink();
    }

    public static void f() {
        Farmer fm = new Farmer();
        Snake sn = new Snake();
        Goat gt = new Goat();
        Tiger tg = new Tiger();

        fm.feedWater(sn);
        fm.feedWater(gt);
        fm.feedWater(tg);
    }

    public void feedAnimal(Animal ht, Animal a) {
        this.bringAnimal(a, "Feeding Room");
        ht.move("Feeding Room");
        Huntable hab = (Huntable) ht;
        hab.hunt(a);
    }
}

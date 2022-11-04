package com.sutton.inner.Parcell;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-11-04 10:10
 **/
public class Parcel4 {
    private class Dog implements Animal {

        /**
         * 吃喝
         */
        @Override
        public void eat() {
            System.out.println("啃骨头");
        }


    }

    public Animal getDog() {
        return new Dog();
    }

    public static void main(String[] args) {
        Parcel4 p4 = new Parcel4();
        //new 的方式实现
        Animal dog = p4.new Dog();
        //GET
        Animal dog1 = p4.getDog();
        dog.eat();
    }
}

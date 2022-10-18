package com.sutton.enumClass;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: switch
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 15:12
 **/
public class Burrito {
    Spiciness degree;

    public Burrito(Spiciness degree) {
        this.degree = degree;
    }

    public void describe(){
        System.out.println("This is byrrito is ");
        switch (degree){
            case HOT -> System.out.println("not spicy at all");
            case MILD -> System.out.println("MILD");
        }
    }

    public static void main(String[] args) {
        Burrito plain=new Burrito(Spiciness.HOT);
        plain.describe();
    }
}

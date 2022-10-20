package com.sutton.interfaceclass.inteface_stu;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 山羊
 * @author: Mr.wang.sutton
 * @create: 2022-10-20 15:14
 **/
public class Goat extends Mammal{
    private static String name = "Goat";
    public String getName(){
        return this.name;
    }

    public void move(String destination){
        System.out.println("Goat moved to " + destination + ".");
    }

    public void drink(){
        System.out.println("Goat lower it's head and drink.");
    }
}

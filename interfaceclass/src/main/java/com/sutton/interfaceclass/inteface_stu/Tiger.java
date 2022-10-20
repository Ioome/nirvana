package com.sutton.interfaceclass.inteface_stu;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 老虎
 * @author: Mr.wang.sutton
 * @create: 2022-10-20 15:12
 **/
public class Tiger  extends Mammal implements Huntable<Animal>{
    private static String name = "Tiger";

    public String getName(){
        return this.name;
    }

    public void move(String destination){
        System.out.println("Goat moved to " + destination + ".");
    }

    public void drink(){
        System.out.println("Goat lower it's head and drink.");
    }


    @Override
    public void hunt(Animal a) {

    }
}

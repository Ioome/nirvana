package com.sutton.Reuse.Space;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 继承太空船
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 19:30
 **/
public class SpaceShip extends SpaceShipControls{
    private String name;

    public SpaceShip(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        SpaceShip protector=new SpaceShip("NSEA Protector");
        protector.forward(100);
    }
}

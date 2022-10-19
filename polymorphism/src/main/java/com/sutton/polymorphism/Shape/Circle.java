package com.sutton.polymorphism.Shape;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: Circle
 * @author: Mr.wang.sutton
 * @create: 2022-10-19 09:57
 **/
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase");
    }

    @Override
    public void print() {
        System.out.println("circle.print");
    }
}

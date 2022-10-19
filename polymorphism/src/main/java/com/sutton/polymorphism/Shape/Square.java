package com.sutton.polymorphism.Shape;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: Square
 * @author: Mr.wang.sutton
 * @create: 2022-10-19 09:58
 **/
public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase");
    }
}

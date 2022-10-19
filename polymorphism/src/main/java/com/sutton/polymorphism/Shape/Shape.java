package com.sutton.polymorphism.Shape;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: shape
 * @author: Mr.wang.sutton
 * @create: 2022-10-19 09:56
 **/
public class Shape {
    public void draw() {
    }

    public void erase() {
    }

    public void print() {
        System.out.println("hello");
    }

    private static RandomShapeGenerator randomShapeGenerator = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = randomShapeGenerator.next();
        }
        for (Shape shape : s) {
            shape.draw();
            shape.print();
        }
    }
}

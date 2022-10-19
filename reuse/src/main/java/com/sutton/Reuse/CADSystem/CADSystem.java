package com.sutton.Reuse.CADSystem;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: cad 系统
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 19:45
 **/
class Shape {
    public Shape(int i) {
        System.out.println("shape constructor");
    }

    void dispose() {
        System.out.println("Shape dispose");
    }
}

class Circle extends Shape {
    public Circle(int i) {
        super(i);
        System.out.println("Drawing  Circle");
    }

    @Override
    void dispose() {
        System.out.println("Erasing Circle");
        super.dispose();
    }
}

class Triangle extends Shape {
    public Triangle(int i) {
        super(i);
        System.out.println("Drawing Triangle");
    }

    @Override
    void dispose() {
        System.out.println("Erasing Triangle");
        super.dispose();
    }
}

class Line extends Shape {
    private int start, end;

    public Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Drawing Lint: " + start + ", " + end);
    }

    @Override
    void dispose() {
        System.out.println("Erasing Line: " + start + "," + end);
        super.dispose();
    }
}


public class CADSystem extends Shape {

    private Circle c;

    private Triangle t;

    private Line[] lines = new Line[3];

    public CADSystem(int i) {
        super(i + 1);
        for (int j = 0; j < lines.length; j++) {
            lines[j] = new Line(j, j * j);
        }
        c = new Circle(1);
        t = new Triangle(1);
        System.out.println("Combined constructor");
    }

    @Override
    void dispose() {
        System.out.println("CADSystem.dispost()");
        t.dispose();
        c.dispose();
        for (int i = lines.length - 1; i >= 0; i--) {
            lines[i].dispose();
        }
        super.dispose();
    }

    public static void main(String[] args) {
        CADSystem cadSystem = new CADSystem(47);
        try {

        } finally {
            cadSystem.dispose();
        }
    }
}

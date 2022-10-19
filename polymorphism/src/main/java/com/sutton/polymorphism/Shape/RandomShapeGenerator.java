package com.sutton.polymorphism.Shape;

import java.util.Random;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 生成
 * @author: Mr.wang.sutton
 * @create: 2022-10-19 09:59
 **/
public class RandomShapeGenerator {
    private Random rand = new Random(47);

    public Shape next() {
        switch (rand.nextInt(2)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Shape();
        }
    }
}

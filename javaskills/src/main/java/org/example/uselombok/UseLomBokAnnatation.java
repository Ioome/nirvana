package org.example.uselombok;

import lombok.ToString;
import lombok.Value;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 使用lombok
 * @author: Mr.wang.sutton
 * @create: 2022-11-02 11:56
 **/

@Value
public class UseLomBokAnnatation {


    private String name;
    private static final int STATIC_VAR = 10;
    private String[] tags;
    @ToString.Exclude
    private int id;

    @ToString(callSuper = true, includeFieldNames = true)
    public static class Square {
        private final int width, height;

        public Square(int width, int height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public String toString() {
            return "Square(super=" + super.toString() + ", width=" + this.width + ", height=" + this.height + ")";
        }
    }

    public static void main(String[] args) {
        UseLomBokAnnatation useLomBokAnnatation = new UseLomBokAnnatation();
        useLomBokAnnatation.setName("hello github");
        System.out.println(useLomBokAnnatation.toString());
        Square square = new Square(2200, 3000);
        System.out.println(square.toString());
    }
}

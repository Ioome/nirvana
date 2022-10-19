package com.sutton.Reuse.combination;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: Composition for code reuse
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 17:47
 **/
public class WaterSource {
    private String s;

    public WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return "WaterSource{" +
                "s='" + s + '\'' +
                '}';
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklerSystem = new SprinklerSystem();
        System.out.println(sprinklerSystem);
    }

}

class SprinklerSystem {
    private String value1, value2, value3, value4;
    private WaterSource source = new WaterSource();

    private int i;

    private float f;

    @Override
    public String toString() {
        return "SprinklerSystem{" +
                "value1='" + value1 + '\'' +
                ", value2='" + value2 + '\'' +
                ", value3='" + value3 + '\'' +
                ", value4='" + value4 + '\'' +
                ", source=" + source +
                ", i=" + i +
                ", f=" + f +
                '}';
    }
}

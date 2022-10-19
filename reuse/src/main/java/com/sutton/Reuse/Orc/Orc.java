package com.sutton.Reuse.Orc;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: orc
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 20:12
 **/
class Villain {
    private String name;

    protected void set(String name) {
        this.name = name;
    }

    public Villain(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Villain{" +
                "name='" + name + '\'' +
                '}';
    }


}

public class Orc extends Villain {

    private int orcNumber;

    public Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }

    public void change(String name, int orcNumber) {
        set(name);
        this.orcNumber = orcNumber;
    }

    @Override
    public String toString() {
        return "Orc{" +
                "orcNumber=" + orcNumber +
                '}' + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Limburger ", 12);
        System.out.println(orc);
    }
}

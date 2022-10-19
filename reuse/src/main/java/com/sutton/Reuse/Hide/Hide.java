package com.sutton.Reuse.Hide;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 隐藏
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 20:03
 **/
class Homer {
    char doh(char c) {
        System.out.println("doh(char)");
        return 'd';
    }

    float doh(float f) {
        System.out.println("doh(float");
        return 1.0f;
    }

}

class Milhouse {

}

class Bart extends Homer {

    void doh(Milhouse m) {
        System.out.println("doh(Milhouse)");
    }
}

public class Hide {

    public static void main(String[] args) {
        Bart bart = new Bart();
        bart.doh(1);
        bart.doh('x');
        bart.doh(1.0f);
        bart.doh(new Milhouse());
    }
}

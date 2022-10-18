package com.sutton.permissions.impo;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: order
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 16:42
 **/
public class Order {

    private int orderPrivate;

    int orderDefault;

    public int orderPublic;

     int orderProtected;

    private void methodPrivate() {
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }

    void methodDefault() {
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }

    public void methodPublic() {
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }

}

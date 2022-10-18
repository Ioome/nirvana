package com.sutton.permissions.impo;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 订单
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 16:56
 **/
public class OrderTest {
    public static void main(String[] args) {
        Order order=new Order();
        order.orderPublic=1;
        order.orderDefault=2;
        order.methodDefault();
        order.methodPublic();
    }
}

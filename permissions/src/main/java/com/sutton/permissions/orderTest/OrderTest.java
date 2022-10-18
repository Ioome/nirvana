package com.sutton.permissions.orderTest;

import com.sutton.permissions.impo.Order;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 测试
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 17:03
 **/
public class OrderTest extends Order {

    public void print(){

    }
    public static void main(String[] args) {
        Order order = new Order();
        order.orderPublic = 1;
        OrderTest orderTest=new OrderTest();
        orderTest.print();
    }
}

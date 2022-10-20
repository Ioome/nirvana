package com.sutton.interfaceclass.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 测试
 * @author: Mr.wang.sutton
 * @create: 2022-10-20 16:09
 **/
public class Main {
    public static void main(String[] args) {
        Object object = new UserDaoImpl();
        System.out.println(object.getClass().getClassLoader().toString());
        System.out.println(object.getClass().getInterfaces().toString());

        //创建事务处理器
        TransactionHandler handler = new TransactionHandler(object);

        UserDao userDao = (UserDao) Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), handler);

        userDao.save();
    }
}

package com.sutton.interfaceclass.proxy;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-20 15:56
 **/
public class Main {
    public static void main(String[] args) {
        //创建目标对象
        UserDaoImpl userDao = new UserDaoImpl();
        //传入目标对象给代理
        TransactionHandler transactionHandler = new TransactionHandler(userDao);
        //保存
        transactionHandler.save();
    }
}

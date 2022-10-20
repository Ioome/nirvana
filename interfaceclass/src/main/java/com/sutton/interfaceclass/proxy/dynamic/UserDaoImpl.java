package com.sutton.interfaceclass.proxy.dynamic;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 目标对象
 * @author: Mr.wang.sutton
 * @create: 2022-10-20 16:04
 **/
public class UserDaoImpl implements UserDao{
    @Override
    public void save() {
        System.out.println("保存用户信息...");
    }
}

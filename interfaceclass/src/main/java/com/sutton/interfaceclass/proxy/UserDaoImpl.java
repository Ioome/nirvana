package com.sutton.interfaceclass.proxy;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 目标对象
 * @author: Mr.wang.sutton
 * @create: 2022-10-20 15:54
 **/
public class UserDaoImpl implements UserDao{

    /**
     * 保存接口
     */
    @Override
    public void save() {
        System.out.println("正在保存用户.....");
    }
}

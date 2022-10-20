package com.sutton.interfaceclass.proxy;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 代理对象
 * @author: Mr.wang.sutton
 * @create: 2022-10-20 15:55
 **/
public class TransactionHandler extends UserDaoImpl implements UserDao{


    /**
     * 传入需要被代理的类型
     */
    private  UserDaoImpl userDao;


    /**
     * 传入需要被代理的对象
     * @param userDao
     */
    public TransactionHandler(UserDaoImpl userDao) {
        this.userDao = userDao;
    }



    /**
     * 保存接口
     */
    @Override
    public void save() {
        System.out.println("开启事务");
        userDao.save();
        System.out.println("结束事务");
    }
}

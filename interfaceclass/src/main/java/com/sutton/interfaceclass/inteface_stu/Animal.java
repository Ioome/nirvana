package com.sutton.interfaceclass.inteface_stu;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 抽象动物类
 * @author: Mr.wang.sutton
 * @create: 2022-10-20 15:09
 **/
public abstract class Animal {
    public abstract String getName();

    public abstract void move(String destination);

    public abstract void drink();
}

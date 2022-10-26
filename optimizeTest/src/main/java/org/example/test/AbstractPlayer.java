package org.example.test;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 抽象类
 * @author: Mr.wang.sutton
 * @create: 2022-10-25 22:27
 **/
public abstract class AbstractPlayer {
    abstract void play();

    public void sleep() {
        System.out.println("运动员也要休息而不是挑战极限");

    }
}
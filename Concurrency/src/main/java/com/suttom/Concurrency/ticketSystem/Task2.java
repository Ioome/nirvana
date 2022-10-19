package com.suttom.Concurrency.ticketSystem;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 不加锁的班恩
 * @author: Mr.wang.sutton
 * @create: 2022-10-19 12:29
 **/
public class Task2 implements Runnable{

    /**
     * 1000 张票
     */
    private int ticket=1000;


    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        
    }
}

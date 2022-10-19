package com.suttom.Concurrency.ticketSystem;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 不加锁
 * @author: Mr.wang.sutton
 * @create: 2022-10-19 12:48
 **/
public class MyThread extends Thread {

    //保证多个线程只有一个域
    private static int ticket = 1000;

    public MyThread(String name) {
        super(name);
    }


    /**
     * If this thread was constructed using a separate
     * {@code Runnable} run object, then that
     * {@code Runnable} object's {@code run} method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of {@code Thread} should override this method.
     *
     * @see #start()
     * @see #stop()
     * @see #Thread(ThreadGroup, Runnable, String)
     */
    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(this.getName() + "正在销售 " + ticket + "票");
                ticket--;
            } else {
                System.out.println(this.getName() + "票已经销售完毕");
                break;
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i<=9) {
                new MyThread("窗口00"+i).start();
            } else {
                new MyThread("窗口010").start();
            }
        }
    }
}

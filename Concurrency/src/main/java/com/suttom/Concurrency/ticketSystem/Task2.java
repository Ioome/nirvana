package com.suttom.Concurrency.ticketSystem;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 铁道部发布了一个售票任务，要求销售1000张票，要求有10个窗口来进行销售，请编写多线程程序来模拟这个效果 iv.窗口001正在销售第1000张票 v.窗口001正在销售第999张票'
 * 采用多线程方式执行
 * @author: Mr.wang.sutton
 * @create: 2022-10-19 12:29
 **/
public class Task2 implements Runnable {

    /**
     * 1000 张票
     */
    private int ticket = 1000;


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
       synchronized (this){
           while (true) {
               if (ticket > 0) {
                   System.out.println(Thread.currentThread().getName() + "正在销售 " + ticket + "票");
                   ticket--;
               } else {
                   System.out.println(Thread.currentThread().getName() + "销售完毕");
                   break;
               }
           }
       }
    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        for (int i = 0; i <= 10; i++) {
            if (i <= 9) {
                new Thread(task2, "窗口00 " + i).start();
            } else {
                new Thread(task2, "窗口10 " + i).start();
            }

        }
    }
}

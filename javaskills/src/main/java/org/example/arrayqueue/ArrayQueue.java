package org.example.arrayqueue;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 数组实现 队列
 * @author: Mr.wang.sutton
 * @create: 2022-11-14 09:10
 **/
public class ArrayQueue {
    /**
     * 最大值
     */
    private Integer maxSize;
    /**
     * 增加移动指针
     */
    private int rear;
    /**
     * 获取移动指针
     */
    private int front;
    /**
     * 数组
     */
    private Integer array[];

    /**
     * @param maxSize 一个队列的大小
     */
    public ArrayQueue(Integer maxSize) {
        this.maxSize = maxSize;
        array = new Integer[maxSize];
        //指向队列头部,分析出 front 是指向队列头的数据
        this.front = -1;
        // 指向队尾数据
        this.rear = -1;
    }

    /**
     * 判断队列是否满
     * rear=maxSize-1;
     */
    public boolean queueFull() {
        return rear==maxSize;
    }

    /**
     * 判断队列是空
     */
    public boolean queueIsEmpty() {
        return Objects.equals(rear, front);
    }

    /**
     * 判断是否为满
     *
     * @param element 插入元素
     * @throws Exception
     */
    public void addElementToQueue(Integer element) throws Exception {
        //判断队列是否为满
        if (queueIsEmpty()) {
            System.out.println("队列已满不可加入数据");
            throw new Exception("hello");
        }
        rear++;
        array[rear] = element;
    }

    /**
     * @return 根据先进先出的特性返回数据
     */
    public Integer getQueueElement() {
        //判断是否为空
        if (queueIsEmpty()) {
            //返回 front
            return front;
        }
        //指针向后移动
        front++;
        return array[front];
    }

    /**
     * 遍历 队列
     */
    public void showQueue() {
        if (queueIsEmpty()) {
            System.out.println("队列是空的");
        }
        Arrays.stream(array).forEach(t -> System.out.println(Arrays.toString(array)));
    }

    /**
     * 返回头部数据
     */
    public Integer pickHeadQueue() {
        if (queueIsEmpty()) {
            System.out.println("队列是空的");
        }
        //加一的原因是因为指向前一个元素
        System.out.println("队列头部数据:  " + array[front + 1]);
        return array[front + 1];
    }

    /**
     * @param args 方法参数
     */
    public static void main(String[] args) throws Exception {
        ArrayQueue arrayQueue = new ArrayQueue(10);
        char key = ' ';
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("s(show): showQueue");
            System.out.println("e(exit): exitQueue");
            System.out.println("a(add):  addData");
            System.out.println("g(get): getData");
            System.out.println("h(head): viewHeadData");
            key = scanner.next().charAt(0);
            switch (key) {
                case 's':
                    arrayQueue.showQueue();
                    break;
                case 'a':
                    System.out.println("输出一个数");
                    Integer value = scanner.nextInt();
                    arrayQueue.addElementToQueue(value);
                    break;
                case 'g':
                    int res = arrayQueue.getQueueElement();
                    System.out.println("返回数据: " + res);
                    break;
                case 'h':
                    int headQueue = arrayQueue.pickHeadQueue();
                    System.out.println("查看队列头数据: " + headQueue);
                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    break;
                default:
                    break;
            }
            System.out.println("程序退出🦍");
        }
    }
}

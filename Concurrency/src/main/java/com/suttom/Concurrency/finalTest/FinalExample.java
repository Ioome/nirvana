package com.suttom.Concurrency.finalTest;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 例子
 * @author: Mr.wang.sutton
 * @create: 2022-10-19 23:30
 **/
public class FinalExample {
    int i;                            // 普通变量
    int j;                      //final 变量
    static FinalExample obj;

    public void FinalExample() {     // 构造函数
        i = 1;                        // 写普通域
        j = 2;                        // 写 final 域
    }

    public static void writer() {    // 写线程 A 执行
        obj = new FinalExample();
    }

    public static void reader() {       // 读线程 B 执行
        FinalExample object = obj;       // 读对象引用
        int a = object.i;                // 读普通域
        int b = object.j;                // 读 final 域
    }
}

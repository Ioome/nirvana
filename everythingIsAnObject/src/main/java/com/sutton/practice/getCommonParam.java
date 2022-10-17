package com.sutton.practice;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 写一个程序，打印出从命令行获取的三个参数
 * @author: Mr.wang.sutton
 * @create: 2022-10-17 10:00
 **/
public class getCommonParam {
    public static void main(String[] args) {
        for (int i = 0; i <args.length; i++) {
            System.out.println(args[i]);
        }
    }
}

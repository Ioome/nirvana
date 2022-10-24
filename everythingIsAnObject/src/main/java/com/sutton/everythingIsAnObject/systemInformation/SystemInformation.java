package com.sutton.everythingIsAnObject.systemInformation;

import java.util.Date;
import java.util.Properties;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 它能打印出与当前运行的系统有关的资料
 * @author: Mr.wang.sutton
 * @create: 2022-10-17 09:24
 **/
public class SystemInformation {
    public static void main(String[] args) {
        System.out.println(new Date());
        Properties p = System.getProperties();
        p.list(System.out);
        System.out.println("--- Memory Usage:");
        System.out.println("---- Memory Usage:");
        Runtime rt=Runtime.getRuntime();
        //总空间,空闲空间,最大空间
        System.out.println("Total memory ="
                        + rt.totalMemory()/1000/1000
                        + " Free memory ="
                        + rt.freeMemory()/1000/1000
                        +"  Max memory ="
                        + rt.maxMemory()/1000/1000);
    }
}

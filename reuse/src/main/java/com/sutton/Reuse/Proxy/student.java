package com.sutton.Reuse.Proxy;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 学生
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 19:40
 **/
public class student {
    public void findWork() {
        System.out.println("开始");
        proxyMain.findWork();
        System.out.println("结束");
    }

    //代理
    proxyMain proxyMain=new proxyMain();
}

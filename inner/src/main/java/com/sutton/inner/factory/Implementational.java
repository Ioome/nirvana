package com.sutton.inner.factory;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 产品一号
 * @author: Mr.wang.sutton
 * @create: 2022-10-22 19:30
 **/
public class Implementational implements Service {
    private Implementational() {
    }

    /**
     *
     */
    @Override
    public void method1() {
        System.out.println("hello");
    }

    /**
     *
     */
    @Override
    public void method2() {
        System.out.println("github");
    }

    /**
     * 工厂
     */
    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementational();
        }
    };

}

package com.sutton.inner.factory;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-22 19:32
 **/
public class Implementational2 implements Service {

    private Implementational2() {
    }

    /**
     *
     */
    @Override
    public void method1() {
        System.out.println("Hello");
    }

    /**
     *
     */
    @Override
    public void method2() {
        System.out.println("google");
    }

    /**
     * 工厂
     */
    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementational2();
        }
    };
}

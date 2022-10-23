package com.sutton.inner.factory;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-22 19:29
 **/
public interface ServiceFactory {

    /**
     * 返回相应的产品
     * @return
     */
    Service getService();
}

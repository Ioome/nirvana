package org.example.clearif;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 抛出异常接口
 * @author: Mr.wang.sutton
 * @create: 2022-11-02 09:18
 **/
@FunctionalInterface
public interface ThrowExceptionFunction {


    /**
     * 抛出异常信息
     *
     * @param message 异常信息
     * @return void
     */
    void throwMessage(String message);
}

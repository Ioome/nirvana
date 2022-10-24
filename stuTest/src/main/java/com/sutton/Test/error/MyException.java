package com.sutton.Test.error;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 自定义错误
 * @author: Mr.wang.sutton
 * @create: 2022-10-24 16:48
 **/
public class MyException extends Exception{

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}

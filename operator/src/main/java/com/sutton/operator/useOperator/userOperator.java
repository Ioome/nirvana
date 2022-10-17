package com.sutton.operator.useOperator;

import java.util.Map;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 运算符以一个或多个参数为基础，可生成一个新值。参数采用与原始方法调用不同的一种形式，但效果是相同的
 * @author: Mr.wang.sutton
 * @create: 2022-10-17 11:00
 **/
public class userOperator {

    /**
     * 结果
     */
    private static double result;

    private static double processResult;

    public static void priority() {
        result=10+3-2/2+3;
        processResult=10+(3-2)/(2+3);
        System.out.println(result);
        System.out.println(processResult);
    }

    public static void main(String[] args) {
            priority();
    }
}

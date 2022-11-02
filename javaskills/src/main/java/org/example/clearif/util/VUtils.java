package org.example.clearif.util;

import org.example.clearif.BranchHandle;
import org.example.clearif.ThrowExceptionFunction;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 抛出异常的工具类
 * @author: Mr.wang.sutton
 * @create: 2022-11-02 09:19
 **/
public class VUtils {

    /**
     * 如果参数为真则抛出异常
     *
     * @param b 条件
     * @return org.example.clearif.ThrowExceptionFunction
     */
    public static ThrowExceptionFunction isTure(boolean b) {

        return (errorMessage) -> {
            //如果为真
            if (b) {
                //抛出异常
                throw new RuntimeException(errorMessage);
            }
        };
    }


    public static BranchHandle isTureOrFalse(boolean b) {
        return ((trueRunnable, falseRunable) -> {
            if (b) {
                trueRunnable.run();
            } else {
                falseRunable.run();
            }
        });
    }
}

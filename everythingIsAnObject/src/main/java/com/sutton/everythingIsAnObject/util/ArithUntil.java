package com.sutton.everythingIsAnObject.util;

import java.math.BigDecimal;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 由于Java的简单类型不能够精确的对浮点数进行运算，这个工具类提供精   * 确的浮点数运算，包括加减乘除和四舍五入
 * @author: Mr.wang.sutton
 * @create: 2022-10-15 17:35
 **/
public class ArithUntil {

    /**
     * 默认除法运算精度
     */
    private static final int DEF_DIV_SCALE = 10;

    /**
     * 默认不可实例化
     */
    private ArithUntil() {
    }

    /**
     * 处理加法运算
     *
     * @param parameter_one
     * @param parameter_two
     * @return double
     */
    public static double add(double parameter_one, double parameter_two) {
        BigDecimal param_one = new BigDecimal(String.valueOf(parameter_one));
        BigDecimal parma_two = new BigDecimal(String.valueOf(parameter_two));
        return param_one.add(parma_two).doubleValue();
    }

    /**
     * 作一个减法操作
     *
     * @param parameter_one
     * @param parameter_two
     * @return 两者相减去的结果
     */
    public static double substract(double parameter_one, double parameter_two) {
        BigDecimal param_one = new BigDecimal(String.valueOf(parameter_one));
        BigDecimal parma_two = new BigDecimal(String.valueOf(parameter_two));
        return param_one.subtract(parma_two).doubleValue();
    }

    /**
     * 乘法操作
     *
     * @param parameter_one
     * @param parameter_two
     * @return 两者相乘的结果
     */
    public static double multiplication(double parameter_one, double parameter_two) {
        BigDecimal param_one = new BigDecimal(String.valueOf(parameter_one));
        BigDecimal parma_two = new BigDecimal(String.valueOf(parameter_two));
        return param_one.multiply(parma_two).doubleValue();
    }

    /**
     * 除法操作
     *
     * @param parameter_one
     * @param parameter_two
     * @return 两者相除的结果
     */
    public static double division(double parameter_one, double parameter_two) {
        return accuracyCalculation(parameter_one, parameter_two, DEF_DIV_SCALE);
    }

    /**
     * 根据 DEF_DIV_SCALE 对不可精确的数进行四舍五入
     *
     * @param parameter_one
     * @param parameter_two
     * @param defaultDivScale
     * @return 被 defaultDivScale 处理过的一个除法操作结果.
     */
    public static double accuracyCalculation(double parameter_one, double parameter_two, int defaultDivScale) {
        if (defaultDivScale < 0) {
            throw new IllegalArgumentException("The Scale must a positive Integer👩");
        }
        BigDecimal param_one = new BigDecimal(parameter_one);
        BigDecimal param_two = new BigDecimal(parameter_two);
        return param_one.divide(param_two).doubleValue();
    }


    /**
     * 四舍五入
     * @param parameter_one
     * @param defaultDivScale
     * @return 返回已经四舍五入的结果
     */
    public static double round(double parameter_one, int defaultDivScale) {
        if (defaultDivScale < 0) {
            throw new IllegalArgumentException("The scale must  a positive Integer.");
        }
        BigDecimal param_one = new BigDecimal(parameter_one);
        BigDecimal one_Accuracy = new BigDecimal("1");
        return param_one.divide(one_Accuracy, defaultDivScale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }


}

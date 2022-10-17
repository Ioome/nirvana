package com.sutton.operator.useMove;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 移位运算符
 * @author: Mr.wang.sutton
 * @create: 2022-10-17 15:13
 **/
public class useMove<T> {


    /**
     * 获取类型最大值
     */
    public static int getMaxInt() {
        return (1 << 31) - 1;
    }

    public static int getMinInt() {
        return (1 << 31);
    }

    /**
     * Access to the maximum and the minimum
     *
     * @return 返回最大值和最小值数组
     */
    public static int[] getIntegerMax() {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int[] value = new int[2];
        value[0] = max;
        value[1] = min;
        return value;
    }

    /**
     * 打印 prt
     */
    public static void prt() {
        int[] numberValueSize = getIntegerMax();
        for (int i : numberValueSize) {
            System.out.println(i);
        }
    }

    /**
     * 乘 2
     *
     * @param n
     * @return
     */
    public static int multiplicationTwo(int n) {
        return n << 1;
    }

    /**
     * 除2
     *
     * @param n
     * @return 移动后
     */
    public static int devideTwo(int n) {
        return n >> 1;
    }

    /**
     * 根据 m 移动
     *
     * @param n
     * @param m
     * @return
     */
    static int mulTwoPower(int n, int m) { //计算n*(2^m)
        return n << m;
    }

    /**
     * 判断一个数的奇偶性
     *
     * @param n
     * @return
     */
    static boolean isOddNumber(int n) {
        return (n & 1) == 1;
    }

    /**
     * 取一个数的绝对值
     *
     * @param n
     * @return 负数转正数
     */
    static int abs(int n) {
        return (n ^ (n >> 31)) - (n >> 31);
    }

    /**
     * 求一个数的平均数
     *
     * @param x
     * @param y
     * @return getAverage
     */
    static int getAverage(int x, int y) {
        return (x + y) >> 1;
    }

    /**
     * 判断符号是否相同
     * @param x
     * @param y
     * @return
     */
    static boolean isSameSign(int x, int y) {
        /**
         * true 表示 x和y有相同的符号， false表示x，y有相反的符号。
         */
        return (x ^ y) > 0;
    }

    public static void main(String[] args) {
        prt();
        System.out.println(abs(-20));
    }
}

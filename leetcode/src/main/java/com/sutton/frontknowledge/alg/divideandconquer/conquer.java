package com.sutton.frontknowledge.alg.divideandconquer;

import java.util.Arrays;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 分而治之算法
 * 该问题涉及到大量的数据，如果只需要处理少量的数据，问题会变得非常容易解决
 * 先将整个问题拆分成多个相互独立且数据量更少的小问题，通过逐一解决这些简单的小问题，最终找到解决整个问题的方案
 * 所谓问题间相互独立，简单理解就是每个问题都可以单独处理，不存在“谁先处理，谁后处理”的次序问题
 * 分:划分小问题
 * 治:逐个解决所有的小问题
 * 合并：解决问题合并
 * @author: Mr.wang.sutton
 * @create: 2022-10-28 20:28
 **/
public class conquer {

    /**
     * 寻找数组最大值和最小值
     * 普通算法
     *
     * @param array 需要查找的数组
     * @return 返回最大值和最小值数组
     */
    public static int[] finMaxAndMin(int[] array) {
        int max;
        int min;
        max = array[0];
        min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < max) {
                min = array[i];
            }
        }
        int[] maxAndMin = new int[]{max, min};
        return maxAndMin;
    }


    /**
     * 寻找最大值
     *
     * @param array 数组
     * @param left  左边
     * @param right 右边
     * @return 返回最大值
     */
    public static int get_max(int[] array, int left, int right) {
        /**
         * 对数组进行校验
         */
        if (array == null || array.length == 0) {
            return -1;
        }

        /**
         * 判断传递的参数是有多少个
         * 治
         */
        if (right - left <= 1) {
            //比较
            if (array[left] >= array[right]) {
                return array[left];
            }
            return array[right];
        }
        //划分.
        int middle = (right - left) / 2 + left;
        //递归.
        int max_left = get_max(array, left, middle);
        int max_right = get_max(array, middle + 1, right);
        if (max_left >= max_right) {
            return max_left;
        } else {
            return max_right;
        }
    }


    /**
     *  TODO:寻找最小值
     *
     * @param array 数组
     * @param left  左边
     * @param right 右
     * @return 返回最小值
     */
    public static int get_min(int[] array, int left, int right) {
        /**
         * 对数组进行校验
         */
        if (array == null || array.length == 0) {
            return -1;
        }

        /**
         * 判断传递的参数是有多少个
         * 治
         */
        if (right - left <= 1) {
            //比较
            if (array[left] >= array[right]) {
                return array[left];
            }
            return array[right];
        }
        //划分.
        int middle = (right - left) / 2 + left;
        //递归.
        int max_left = get_max(array, left, middle);
        int max_right = get_max(array, middle + 1, right);
        if (max_left >= max_right) {
            return max_left;
        } else {
            return max_right;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(finMaxAndMin(new int[]{1, 2, 3, 4, 5, 6, 7, 8})));
        System.out.println(get_max(new int[]{1,34,4,1,9,0},0,5));
        System.out.println(get_min(new int[]{1,2,3,4,5,5},0,5));
    }
}

package com.sutton.leetcode.TwoNumber;

/**
 * @version 1.0.0
 * @program: nirvana
 * @description: LeetCode 第一题：两数之和
 * 1.条件: 整数数组 nums和 一个整数目标值 target
 * 2.功能: 查找⭐
 * 3.功能详情:  从数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标
 * 4.目标: 返回下标
 * 5.额外条件:你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现.你可以按任意顺序返回答案。
 * @author: Mr.wang.sutton
 * @create: 2022-10-26 11:36
 **/
public class leetTwoNumber {

    /**
     * 暴力破解法
     *
     * @param aimArray 数据数组
     * @param target   目标
     * @return int[2]  返回数组下标
     */
    public static int[] getArrayTwoIndex(int[] aimArray, int target) {
        //获取长度.📏
        for (int i = 0; i < aimArray.length; i++) {
            for (int j = i + 1; j < aimArray.length; j++) {
                if (aimArray.equals(target)) {
                    System.out.println("hello");
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        getArrayTwoIndex(new int[]{1, 2, 3, 4, 5, 6, 7}, 5);
    }
}



package com.sutton.frontknowledge.basic.array;

import java.util.Arrays;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 将数组中的 0 移到末尾
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * @author: Mr.wang.sutton
 * @create: 2022-10-27 11:48
 **/
public class MoveZeroesEasy {


    /**
     * 1.取出值
     * 2.判断不等于0，
     * 3.将值覆盖到 第一位
     * 4.依次覆盖
     * 5.得到 idx 并向后填充
     * @param nums 拥有 0 的卡拉狄
     */
    public static void moveZeroes(int[] nums) {
        //覆盖法
        int idx = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[idx++] = num;
            }
        }
        while (idx < nums.length) {
            nums[idx++] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        moveZeroes(new int[]{0, 1, 0, 3, 12});
    }
}

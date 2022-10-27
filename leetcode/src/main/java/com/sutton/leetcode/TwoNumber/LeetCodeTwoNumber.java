package com.sutton.leetcode.TwoNumber;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
public class LeetCodeTwoNumber {

    /**
     * 暴力破解法 O(n2) 时间复杂度
     *
     * @param aimArray 数据数组
     * @param target   目标
     * @return int[2]  返回数组下标
     */
    public static int[] getArrayTwoIndex(int[] aimArray, int target) {
        int[] answer = new int[2];
        //获取长度.📏
        for (int i = 0; i < aimArray.length; i++) {
            for (int j = i + 1; j < aimArray.length; j++) {
                //迭代符合条件的数,当有相同的数之后tiaochu
                if (aimArray[i] + aimArray[j] == target) {
                    //
                    answer[0] = i;
                    answer[1] = j;
                    //返回结果
                    return answer;
                }
            }
        }
        //返回结果
        return answer;
    }


    /**
     * 暴力破解法 O(n) 时间复杂度
     *
     * @param aimArray 数据数组
     * @param target   目标
     * @return int[2]  返回数组下标
     */
    public static int[] getArrayTwoIndexSeo(int[] aimArray, int target) {
        int[] answer = new int[2];

        //获取长度.📏
        for (int i = 0; i < aimArray.length; i++) {
            int subtractor;
            for (int j = i + 1; j < aimArray.length; j++) {
                //迭代符合条件的数,当有相同的数之后跳出.优化： 目标-迭代值=结果
                subtractor = target - aimArray[i];
                if (aimArray[j] == subtractor) {
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }
        //返回结果
        return answer;
    }

    /**
     * HashTable 表
     * 把数组的每个元素保存为 hash 的 key，下标保存为 hash 的 value
     *
     * @param aimArray 数据数组
     * @param target   目标
     * @return int[2]  返回数组下标
     */
    public static int[] getArrayTwoIndexHashTableSeo(int[] aimArray, int target) {
        //存取数组的值 和 key
        Map<Integer, Integer> container = new HashMap<>();

        //将每个值存放至HashMap
        for (int i = 0; i < aimArray.length; i++) {
            container.put(aimArray[i], i);
        }

        int subtractor;
        for (int i = 0; i < aimArray.length; i++) {
            //目标减去数组得到第一个
            subtractor=target-aimArray[i];
            //查找容器是否存在
            if(container.containsKey(subtractor)&&container.get(subtractor)!=i){
                 return new int[]{i,container.get(subtractor)};
            }
        }

        //返回结果
        throw new IllegalArgumentException("No two sum solution");
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArrayTwoIndex(new int[]{1, 2, 3, 4, 5, 6, 7}, 5)));
        System.out.println(Arrays.toString(getArrayTwoIndexSeo(new int[]{1, 2, 3, 4, 5, 6, 7}, 5)));
        System.out.println(Arrays.toString(getArrayTwoIndexHashTableSeo(new int[]{1, 2, 3, 4, 5, 6, 7}, 5)));
    }
}



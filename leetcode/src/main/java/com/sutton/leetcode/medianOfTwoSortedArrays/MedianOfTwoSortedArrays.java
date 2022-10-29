package com.sutton.leetcode.medianOfTwoSortedArrays;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 寻找中位数
 * 已知两个有序数组，找到两个数组合并后的中位数
 * 顺序排列，
 * 分奇数 偶数
 * 偶数是两位数相加/2
 * 奇数是中间那位
 * @author: Mr.wang.sutton
 * @create: 2022-10-29 20:53
 **/
public class MedianOfTwoSortedArrays {

    /**
     * 粗暴法
     *
     * @param nums1 数组 1
     * @param nums2 数组 2
     * @return 返回中位数
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums;
        int m = nums1.length;
        int n = nums2.length;
        nums = new int[m + n];
        if (m == 0) {
            if (n % 2 == 0) {
                return (nums2[n / 2 - 1] + nums2[n / 2]) / 2.0;
            } else {

                return nums2[n / 2];
            }
        }
        if (n == 0) {
            if (m % 2 == 0) {
                return (nums1[m / 2 - 1] + nums1[m / 2]) / 2.0;
            } else {
                return nums1[m / 2];
            }
        }

        int count = 0;
        int i=0,j = 0;
        while (count!=(m+n)){
            if (i == m) {
                while (j != n) {
                    nums[count++] = nums2[j++];
                }
                break;
            }
            if (j == n) {
                while (i != m) {
                    nums[count++] = nums1[i++];
                }
                break;
            }

            //
            if (nums1[i] < nums2[j]) {
                nums[count++] = nums1[i++];
            } else {
                nums[count++] = nums2[j++];
            }
        }
        if (count % 2 == 0) {
            return (nums[count / 2 - 1] + nums[count / 2]) / 2.0;
        } else {
            return nums[count / 2];
        }
    }

    public static void main(String[] args) {

        System.out.println(findMedianSortedArrays(new int[]{4, 2, 3, 4, 5, 8}, new int[]{1, 1, 0, 1, 13, 14}));
    }
}

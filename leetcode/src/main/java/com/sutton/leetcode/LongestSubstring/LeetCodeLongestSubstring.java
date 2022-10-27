package com.sutton.leetcode.LongestSubstring;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 最长不重复子串
 * 1.条件:给定一个字符串 s
 * 2.功能:查找
 * 3.功能详情:找出其中不含有 重复字符 的 最长子串 的长度
 * 4.目标:查找出长度
 * 5.额外条件:0 <= s.length <= 5 * 104
 * s 由英文字母、数字、符号和空格组成
 * 6.科普: 串中任意个  连续 的字符组成的子序列  子序列可以不连续，子串必须连续。
 * @author: Mr.wang.sutton
 * @create: 2022-10-27 07:44
 **/
public class LeetCodeLongestSubstring {

    /**
     * violence
     *
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0; //保存当前得到满足条件的子串的最大值
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if(allUnique(s,i,j))
                    ans=Math.max(ans,j-i);
            }
        }
        return ans;
    }

    public static boolean allUnique(String s,int start,int end){
        //无序不重复
        Set<Character> set = new HashSet<>();//初始化 hash set
        for (int i=start;i<end;i++){
            Character ch=s.charAt(i);
            if(set.contains(ch))return  false;
            set.add(ch);
        }
        return true;
    }

    /**
     * SlidingWindow
     *
     * @param s
     * @return 满足条件的子串的最大值
     */
    public static int lengthOfLongestSubstringSlidingWindow(String s) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("helloEEEE"));
    }
}

package com.sutton.leetcode.reverse;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 反转整数
 * @author: Mr.wang.sutton
 * @create: 2022-10-29 23:23
 **/
public class reverse {
    public static int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            rev = rev * 10 + pop;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;
        return (int) rev;
    }

    public static void append(String s) {
        int i = 1;
        while (i < 100000000) {
            s += "github";
            System.out.println(s);
            i++;
        }
    }

    public static void main(String[] args) {
        append("hello");
        System.out.println(reverse(1534236469));
    }
}

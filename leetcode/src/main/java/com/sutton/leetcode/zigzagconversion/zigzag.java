package com.sutton.leetcode.zigzagconversion;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: Z字符号
 * 就是给定一个字符串，然后按写竖着的 「z」的方式排列字符，就是下边的样子。
 * @author: Mr.wang.sutton
 * @create: 2022-10-29 22:55
 **/
public class zigzag {

    public static String convert(String s, int numRows) {

        if (numRows == 1) return s;

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++)
            rows.add(new StringBuilder());

        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown; //遍历到两端，改变方向
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("pA", 3));
    }
}

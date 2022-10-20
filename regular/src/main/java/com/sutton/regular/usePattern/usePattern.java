package com.sutton.regular.usePattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 使用表达式
 * @author: Mr.wang.sutton
 * @create: 2022-10-20 21:56
 **/
public class usePattern {
    public static void main(String[] args) {
        Pattern pattern = compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher("Visit11111 W3Schools!");
        boolean matchFound=matcher.find();
        if(matchFound){
            System.out.println("找到");
        }else {
            System.out.println("未发现");
        }

    }
}

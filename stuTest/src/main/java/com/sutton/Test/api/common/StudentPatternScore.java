package com.sutton.Test.api.common;

import com.sutton.Test.constant.FilePatternStringConstant;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 匹配学生成绩
 * @author: Mr.wang.sutton
 * @create: 2022-10-24 17:42
 **/
public class StudentPatternScore {
    /**
     * 匹配字母
     * @param b
     * @return
     */
    public static boolean patternScore(CharSequence b) {
        //匹配是否为字母的正则
        Pattern pattern = compile(FilePatternStringConstant.WORD_PATTERN, Pattern.CASE_INSENSITIVE);
        //匹配
        Matcher matcher = pattern.matcher(b);
        //查找
        if (matcher.find()) {
            return true;
        } else {
            return false;
        }
    }
}

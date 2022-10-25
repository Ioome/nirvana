package com.sutton.util.hutool.hutool_core;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.lang.TypeReference;
import cn.hutool.core.util.CharsetUtil;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-25 10:26
 **/
public class useConvert {
    /**
     * 使用 hutool 转换
     */
    public static void useConvert(String param) throws Exception {
        stringTransformData(param);
        stringTransformInt(param);
    }


    /**
     * 字符串转换时间
     *
     * @param param
     * @return 字符串转换为时间
     * @throws Exception
     */
    public static Date stringTransformData(String param) throws Exception {
        String dateStr = "2020年09月29日";
        Date date = Convert.toDate(dateStr);
        return date;
    }

    /**
     * String 转换为 Unicode
     *
     * @param param
     * @return 转换后的字符串
     */
    public static String stringTransformUnicode(String param) {
        String unicodeStr = "沉默王二";
        String unicode = Convert.strToUnicode(unicodeStr);
        return unicode;
    }


    public static void generalizationSubtypes() {
        Object[] a = {"a", "你", "好", "", 1};
        List<String> list = Convert.convert(new TypeReference<List<String>>() {
        }, a);
        System.out.println(list);
    }

    /**
     * Sting 转换为 int
     *
     * @param param
     * @return 转换为 Int
     * @throws Exception
     */
    public static Integer[] stringTransformInt(String param) throws Exception {
        if (param != null) {
            throw new Exception("参数不能为空");
        }
        int paramInt = Convert.toInt(param);
        int paramIntDefault = Convert.toInt(param, 0);
        Integer[] array = new Integer[2];
        Arrays.asList(paramInt, paramIntDefault);
        return array;
    }

    /**
     * 半角转全角
     *
     * @param param
     * @return
     */
    public String stringTransformSbc(String param) {
        String sbc = Convert.toSBC(param);
        return sbc;
    }


    /**
     * 全角转半角
     *
     * @param param
     * @return
     */
    public String stringTransformDbc(String param) {
        String dbc = Convert.toDBC(param);
        return dbc;
    }

    /**
     * 字符串转 Hex
     *
     * @param param
     * @return
     */
    public String stringTransformHex(String param) {
        //结果："e68891e698afe4b880e4b8aae5b08fe5b08fe79a84e58fafe788b1e79a84e5ad97e7aca6e4b8b2"
        String hex = Convert.toHex(param, CharsetUtil.CHARSET_UTF_8);
        return hex;
    }

    /**
     * Hex 转换 字符串
     *
     * @param param
     * @return
     */
    public String hexTransformString(String param) {
        //结果："e68891e698afe4b880e4b8aae5b08fe5b08fe79a84e58fafe788b1e79a84e5ad97e7aca6e4b8b2"
        //注意：在4.1.11之后hexStrToStr将改名为hexToStr
        String raw = Convert.hexToStr(param, CharsetUtil.CHARSET_UTF_8);
        return raw;
    }

    public static void main(String[] args) {
        generalizationSubtypes();
    }

}

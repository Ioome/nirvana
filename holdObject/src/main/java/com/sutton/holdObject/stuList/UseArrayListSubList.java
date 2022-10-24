package com.sutton.holdObject.stuList;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: subList——stu
 * 本篇是学习 ArrayList 中遇到的一篇文章，它告诉我 subList 是有坑的
 * 首先
 * 返回一个以fromIndex为起始索引（包含），以toIndex为终止索引（不包含）的子列表（List）
 * @author: Mr.wang.sutton
 * @create: 2022-10-20 22:33
 **/
public class UseArrayListSubList {

    public static void main(String[] args) {
        //动态数组s
        List<Integer> stuCard = new ArrayList<>();
        //产生1000个
        suttonGenerateNumeberList(stuCard, 10000);
        System.out.println(stuCard.hashCode());
        //使用subList 方法
        List<Integer> beforeThsound = stuCard.subList(0, 1000);
        isoStucard(beforeThsound);
    }

    /**
     * 打印数据
     *
     * @param beforeThsound
     */
    public static void isoStucard(List<Integer> beforeThsound) {
        beforeThsound.stream().forEach(s -> System.out.println(s.toString()));
    }


    /**
     * 产生数据的接口
     *
     * @param stuCard
     * @param numSize
     */
    public static void suttonGenerateNumeberList(List<Integer> stuCard, int numSize) {
        for (int i = 0; i < numSize; i++) {
            stuCard.add(i);
        }
    }
}

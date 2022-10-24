package com.sutton.Test;

import lombok.Data;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 学生实体
 * @author: Mr.wang.sutton
 * @create: 2022-10-24 16:36
 **/

@Data
public class StudentPo {

    /**
     * 学生姓名
     */
    private String name;

    /**
     * 学生成绩
     */
    private double score;

    public StudentPo(String name, double score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "StudentPo{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
package org.example.test;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 读答题卡系统:
 *            TODO: 1.班级排名(由高至低) 平均分(保留两位小数)
 *            TODO: 2.最高分 最低分的同学
 *            TODO: 3.结果输出到本地文件
 * @author: Mr.wang.sutton
 * @create: 2022-10-25 16:28
 **/
public class ReadTopicSystem {

    public String name = "hello github";
    protected String age = "20";
    String address = "赣州";
    private String sex = "男";

    /**
     * @param filepath 指定目录
     * @return 指定目录下的所有文件
     */
    public static List<File> getSheet(String filepath) {
        File file = new File(filepath);
        File[] files = file.listFiles();
        List<File> studentScoreList = Arrays.asList(files);
        return studentScoreList;
    }



    public static void main(String[] args) {
        ReadTopicSystem readTopicSystem=new ReadTopicSystem();
        System.out.println(readTopicSystem.name);
        System.out.println(readTopicSystem.sex);
        System.out.println(readTopicSystem.age);
        System.out.println(readTopicSystem.address);
    }
}

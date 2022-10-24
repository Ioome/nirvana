package com.sutton.Test;

import com.sutton.Test.constant.FileStudentScoreConstant;
import com.sutton.Test.error.MyException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 处理信息接口
 * @author: Mr.wang.sutton
 * @create: 2022-10-24 16:34
 **/
public class ReadSheetSystem {

    /**
     * 存取文件列表
     */
    File[] files = new File[20];

    /**
     * 存取学生姓名 和 成绩
     */
    private Map<String, List<String>> student = new HashMap<>();

    /**
     * 学生实体类
     */
    private final List<StudentPo> studentPos = new ArrayList<>();


    /**
     * 获取指定目录下的文件
     *
     * @param listName
     * @return 指定目录下的文件
     */
    public static File[] readSheetApi(File listName) throws MyException {
        //判断是否为文件
        if (!listName.isDirectory()) {
            throw new MyException("输入目录!!!");
        }
        //获取listname 下的文件
        File[] dirs = listName.listFiles();
        return dirs;
    }


    /**
     * 保存数据到 HashMap 学生信息
     *
     * @param filePath
     */
    public void saveFileData(File filePath) throws IOException {

        /**
         * 存放学生成绩
         */
        List<String> studentScore = new ArrayList<>(20);

        try {
            files = readSheetApi(filePath);
        } catch (MyException e) {
            throw new RuntimeException(e);
        }

        //遍历
        for (int i = 0; i < files.length; i++) {
            //获取文件名
            String fileName = files[i].getName();
            //去除后缀

            FileReader fileReader = new FileReader(files[i].getAbsoluteFile());
            fileName = getFileNameNoEx(fileName);
            //使用缓冲流
            BufferedReader reader = new BufferedReader(fileReader);
            //获取文件内容
            String score;
            // 循环读取
            while ((score = reader.readLine()) != null) {
                //判断是否为字符串
                if (score instanceof String) {
                    studentScore.add(score);
                }
            }
            student.put(fileName, studentScore);
            studentScore = new ArrayList<>();
        }
    }

    public void compareStudentScore() {
        //取出成绩单
        List<String> stardAnswerList = student.get("标准答案");
        System.out.println(stardAnswerList);
        for (String name : student.keySet()) {
            int score = 0;
            for (int i = 0; i < student.get(name).size(); i++) {
                if (student.get(name).get(i).equals(stardAnswerList.get(i))) {
                    score += FileStudentScoreConstant.SCORE;
                }
            }
            StudentPo studentPo = new StudentPo(name, score);
            studentPos.add(studentPo);
        }
    }


    /**
     * 获取最低分
     *
     * @return
     */
    public double getStudentScoreLow() {
        double scoreMax = studentPos.stream().mapToDouble(StudentPo::getScore).min().getAsDouble();
        return scoreMax;
    }

    /**
     * 获取最高分
     *
     * @return
     */
    public double getStudentScoreHight() {
        double scoreMax = studentPos.stream().mapToDouble(StudentPo::getScore).max().getAsDouble();
        return scoreMax;
    }

    /**
     * 学生排名
     *
     * @return
     */
    public void getStudentScoreRankList() {
        studentPos.sort(Comparator.comparing(StudentPo::getScore));
        studentPos.stream().forEach(studentPo -> {
            System.out.println(studentPo.toString());
        });
    }

    /**
     * 获取学生平均分
     *
     * @return
     */
    public StudentAverageDto getStudentAverageScore() {
        StudentAverageDto studentAverageDto = new StudentAverageDto();
        return null;
    }

    /**
     * 去除分数>60分的成绩
     */
    public List<StudentPo> filterStudentScore() {
        List<StudentPo> studentPoList = studentPos.stream().filter(element -> element.getScore() >= 60 && element.getScore() < 100).collect(Collectors.toList());
        return studentPoList;
    }

    /**
     * 返回学生个数
     *
     * @return result
     */
    public long getStudentCount() {
        long result = studentPos.stream().count();
        return result;
    }

    /**
     * 筛选我们想要的学生
     */
    public void getStudnetPo(String name) {
        Stream<StudentPo> studentPoStream = studentPos.stream().filter(element -> element.getName().contains(name));
        studentPoStream.forEach(System.out::println);
    }

    /**
     * 迭代学生成绩
     */
    public void printStudentScore() {
        studentPos.stream().forEach(studentPo -> {
            System.out.println(studentPo.toString());
        });
    }

    /**
     * 获取不带扩展名的文件名
     *
     * @param filename
     * @return 取出后的文件
     */
    public static String getFileNameNoEx(String filename) {
        if ((filename != null) && (filename.length()) > 0) {
            int dot = filename.lastIndexOf(".");
            if ((dot > -1) && (dot < (filename).length())) {
                return filename.substring(0, dot);
            }
        }
        return filename;
    }


    public static void main(String[] args) throws MyException, IOException {
        ReadSheetSystem readSheetSystem = new ReadSheetSystem();
        readSheetSystem.saveFileData(new File("D:\\app\\nirvana\\nirvana\\stuTest\\src\\main\\java\\com\\sutton\\File\\test"));
        readSheetSystem.compareStudentScore();
        readSheetSystem.printStudentScore();
        double score = readSheetSystem.getStudentScoreLow();
        System.out.println(score);
        readSheetSystem.getStudentScoreRankList();
    }

}

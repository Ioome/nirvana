package com.sutton.IO.baseIo.useFile;

import java.io.File;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-23 19:26
 **/
public class useFile {
    public static void main(String[] args) {
        String path = "D:\\113.txt";
        File file = new File(path);

        String path2 = "D:\\1\\2.txt";
        File file1 = new File(path);

        String parent = "F:\\aaa";
        String child = "bbb.txt";
        File file2 = new File(parent, child);

        File parentDir=new File("F:\\aaa");
        String child1="bbb.txt";
        File file4=new File(parentDir,child);

    }
}

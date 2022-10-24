package com.sutton.IO.useFlushDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-23 22:27
 **/
public class useCopyFile {
    public static void main(String[] args) throws IOException {
        //创建输入流对象
        FileReader fr = new FileReader("abc.txt");//文件不存在会抛出java.io.FileNotFoundException
        //创建输出流对象
        FileWriter fw = new FileWriter("b.txt");

        copyMethod1(fr, fw);
        copyMethod2(fr, fw);

        fr.close();
        fw.close();
    }

    public static void copyMethod1(FileReader fr, FileWriter fw) throws IOException {
        int ch;
        while ((ch = fr.read()) != -1) {//读数据
            fw.write(ch);//写数据
        }
        fw.flush();
    }

    public static void copyMethod2(FileReader fr, FileWriter fw) throws IOException {
        char chs[] = new char[1024];
        int len = 0;
        while ((len = fr.read(chs)) != -1) {
            fw.write(chs, 0, len);
        }
        fw.flush();
    }
}

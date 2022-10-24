package com.sutton.IO.useFlushDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-23 22:12
 **/
public class useFlushDemo {
    public static void main(String[] args) throws IOException {
        //源   也就是输入流【读取流】 读取a.txt文件
        FileReader fr = new FileReader("abc.txt");  //必须要存在a.txt文件，否则报FileNotFoundException异常
        //目的地  也就是输出流
        FileWriter fw = new FileWriter("b.txt");  //系统会自动创建b.txt，因为它是输出流！
        int len;
        while ((len = fr.read()) != -1) {
            fw.write(len);
        }
        fw.write("刷");
        fw.flush();

        fw.write('新'); // 继续写出第2个字符，写出成功
        fw.flush();

        // 写出数据，然后close
        fw.write('关'); // 写出第1个字符
        fw.write("\r\n");
        fw.write("闭");
        fw.flush();
        fw.close();

    }
}

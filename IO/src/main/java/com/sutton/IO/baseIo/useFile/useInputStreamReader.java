package com.sutton.IO.baseIo.useFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-23 19:20
 **/
public class useInputStreamReader {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(
                new FileInputStream("Hello.txt"));
        char[] cha=new char[1024];
        int len=isr.read(cha);
        System.out.println(new String(cha,0,len));
        isr.close();
    }
}

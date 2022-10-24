package com.sutton.IO.useFlushDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-23 23:35
 **/
public class useReaderDemo2 {
    public static void main(String[] args) throws IOException {
        String FileName="abc.txt";
        InputStreamReader isr=new InputStreamReader(new FileInputStream(FileName));

        InputStreamReader isr2=new InputStreamReader(new FileInputStream(FileName),"GBK");

        int read;
        while ((read=isr.read())!=1){
            System.out.println((char) read);
        }
        isr.close();

        while ((read=isr2.read())!=1){
            System.out.println((char) read);
        }
        isr2.close();
    }
}

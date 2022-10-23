package com.sutton.IO.baseIo.useFile;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-23 17:38
 **/
public class useByteArrayOutputStream {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] info = "沉默王二".getBytes();
        bos.write(info, 0, info.length);
//获取数据
        byte[] dest = bos.toByteArray();
        for (int i = 0; i <dest.length; i++) {
            System.out.println((char)dest[i]);
        }
//释放资源
        bos.close();
    }
}

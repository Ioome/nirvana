package com.sutton.IO.baseIo.useFile;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-23 17:22
 **/
public class useByteArrayInputStream {


    public static void main(String[] args) throws IOException {
        //内容会先到缓冲，创建缓冲对象
        //先读到缓冲区 再冲缓冲区拿数据
        InputStream is = new BufferedInputStream(new ByteArrayInputStream("沉默王二".getBytes(StandardCharsets.UTF_8)));
        //缓冲对象
        byte[] flush = new byte[1024];
        int len = 0;
        while (-1 != (len = is.read(flush))) {
            System.out.println(new String(flush, 0, len));
        }
        //释放资源
        is.close();
    }
}

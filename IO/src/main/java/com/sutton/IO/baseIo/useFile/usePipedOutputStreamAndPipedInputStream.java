package com.sutton.IO.baseIo.useFile;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.charset.StandardCharsets;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 这个程序是复杂的, 我们输出的属性将被另一个线程读取到 多么身体的一件事
 * @author: Mr.wang.sutton
 * @create: 2022-10-23 17:44
 **/
public class usePipedOutputStreamAndPipedInputStream {
    public static void main(String[] args) throws IOException {
        final PipedOutputStream pipedOutputStream = new PipedOutputStream();
        final PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pipedOutputStream.write("沉默王二".getBytes(StandardCharsets.UTF_8));
                    pipedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    byte[] flush =new byte[1024];
                    int len =0;
                    while(-1!=(len=pipedInputStream.read(flush))){
                        System.out.println(new String(flush,0,len));
                    }

                    pipedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        thread1.start();
        thread2.start();


    }
}

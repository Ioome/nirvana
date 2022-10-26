package com.sutton.IO.socket.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 远程
 * @author: Mr.wang.sutton
 * @create: 2022-10-26 09:36
 **/
public class useServerSocket {

    public static void ServerSocket() throws IOException {
        try (ServerSocket server = new ServerSocket(8888);
             Socket socket = server.accept();
             InputStream is = socket.getInputStream();
             OutputStream os = socket.getOutputStream();

             Scanner scanner = new Scanner(is)) {
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(os, "gbk"), true);
            pw.println("你好啊，欢迎关注「沉默王二」 公众号，回复关键字「2048」 领取程序员进阶必读资料包");

            boolean done = false;
            while (!done && scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);

                if ("2048".equals(line)) {
                    done = true;
                }
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        ServerSocket();
    }
}

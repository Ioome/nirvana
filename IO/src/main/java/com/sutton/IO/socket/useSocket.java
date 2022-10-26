package com.sutton.IO.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 网络编程
 * @author: Mr.wang.sutton
 * @create: 2022-10-26 09:22
 **/
public class useSocket {

    public static void  connectionTelnet(String ip,Integer port){
        try {
            Socket socket=new Socket(ip,port);
            InputStream is=socket.getInputStream();
            Scanner scanner=new Scanner(is,"gbk");
            while (scanner.hasNextLine()){
                String line=scanner.nextLine();
                System.out.println(line);
            }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void main(String[] args) {
        connectionTelnet("localhost",888);
    }
}

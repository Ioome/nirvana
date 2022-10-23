package com.sutton.IO.baseIo.useFile;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-23 17:52
 **/
public class useDataInputStream {
    public static void main(String[] args) throws IOException {
        DataOutputStream das = new DataOutputStream(new FileOutputStream("das.txt"));
        das.writeByte(10);
        das.writeShort(100);
        das.writeInt(1000);
        das.writeLong(10000L);
        das.writeFloat(12.34F);
        das.writeDouble(12.56);
        das.writeBoolean(true);
        das.writeChar('A');
        DataInputStream dis = new DataInputStream(new FileInputStream("Hello.txt")) ;
        byte b = dis.readByte() ;
        short s = dis.readShort() ;
        int i = dis.readInt();
        long l = dis.readLong() ;
        float f = dis.readFloat() ;
        double d = dis.readDouble() ;
        boolean bb = dis.readBoolean() ;
        char ch = dis.readChar() ;
    }
}

package com.sutton.IO.baseIo.useFile;

import java.io.File;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-23 19:46
 **/
public class useFileGet {
    public static void main(String[] args) {
        File f = new File("d:/aaa/bbb.java");
        System.out.println("文件绝对路径：  "+f.getAbsolutePath());
        System.out.println("文件构造路径： "+f.getPath());
        System.out.println("文件名称： "+f.getName());
        System.out.println("文件长度： "+f.length()+"字节");

        File f2=new File("d:/aaa");
        System.out.println("目录绝对路径： "+f2.getAbsolutePath());
        System.out.println("目录构造路径： "+f2.getPath());
        System.out.println("目录名称 "+f2.getName());
        System.out.println("目录长度： "+f2.length());

        File isF1 = new File("d:\\aaa\\bbb.java");
        File isf2 = new File("d:\\aaa");
        // 判断是否存在
        System.out.println("d:\\aaa\\bbb.java 是否存在:"+isF1.exists());
        System.out.println("d:\\aaa 是否存在:"+isf2.exists());
        // 判断是文件还是目录
        System.out.println("d:\\aaa 文件?:"+isf2.isFile());
        System.out.println("d:\\aaa 目录?:"+isf2.isDirectory());
    }
}

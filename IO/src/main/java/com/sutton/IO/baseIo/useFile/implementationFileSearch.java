package sutton.IO.baseIo.useFile;

import java.io.File;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 实现文件搜索
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 14:12
 **/
public class implementationFileSearch {

    public static void main(String[] args) {

    }

    /**
     * 实现文件搜索功能
     *
     * @param file
     * @param name
     */
    private static void printNameByMp3(File file, String name) {
        //返回文件列
        File[] files = file.listFiles();
        //如何长度大于 0
        if (files.length > 0) {
            //遍历当前目录
            for (File f : files) {
                //判断是否文件夹
                if (f.isDirectory()) {
                    //递归
                    printNameByMp3(f, name);
                } else {
                    //返回文件名
                    if (f.getName().endsWith(name)) {
                        System.out.println(f.getName());
                    }
                }
            }
        }
    }
}

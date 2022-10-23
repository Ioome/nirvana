package sutton.IO.baseIo.useFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-23 15:57
 **/
public class useFileInputStream {

    /**
     * 字节流
     *
     * @param path
     * @throws IOException
     */
    public static void printInput(String path) throws IOException {
        int b;
        FileInputStream fileInputStream = new FileInputStream(path);
        System.out.println(fileInputStream);
        try {
            // 循环读取
            while ((b = fileInputStream.read()) != -1) {
                System.out.println((char) b);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            fileInputStream.close();
        }
    }


    public static void outOutputFile(String path) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        fileOutputStream.write("小黑子".getBytes());
        fileOutputStream.close();
    }


    public  static void fileReader(String path) throws IOException {
        int b=0;
        FileReader fileReader=new FileReader(path);
        /**
         * 循环读取
         */
        while ((b=fileReader.read())!=-1){
            System.out.println(b);
        }
    }

    public static void fileWriter(String path) throws IOException {
        FileWriter fileWriter = new FileWriter("fw.txt");
        char[] chars = "沉默王二".toCharArray();
        fileWriter.write(chars, 0, chars.length);
        fileWriter.close();
    }
    /**
     * 主方法
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
//        printInput("D:\\app\\nirvana\\nirvana\\IO\\src\\main\\java\\com\\sutton\\IO\\File\\Hello.txt");
//        outOutputFile("D:\\app\\nirvana\\nirvana\\IO\\src\\main\\java\\com\\sutton\\IO\\File\\Hello.txt");
        fileReader("D:\\app\\nirvana\\nirvana\\IO\\src\\main\\java\\com\\sutton\\IO\\File\\Hello.txt");
        fileWriter("D:\\app\\nirvana\\nirvana\\IO\\src\\main\\java\\com\\sutton\\IO\\File\\Hello.txt");



    }
}

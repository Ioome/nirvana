package com.sutton.permissions.impo;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 导包
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 16:04
 **/
public class testimpo {
    public  static void printPublic(){
        System.out.println("hello");
    }

    static  void  defaultPrint(){
        System.out.println("s");
    }

    protected  static void  printProtected(){
        System.out.println("protected");
    }

    private   void printPrivate(){
        System.out.println("private");
    }

    public static void main(String[] args) {
    }
}

package com.sutton.inner.MainExample;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-22 00:19
 **/
public class MainExample {

    private class Test1 extends ClassA{
        public String name(){
            return super.name();
        }
    }
    private class Test2 extends ClassB{
        public int age(){
            return super.age();
        }
    }
    public String name(){
        return new Test1().name();
    }
    public int age(){
        return new Test2().age();
    }

    public static void main(String[] args) {
        MainExample mainExample=new MainExample();
        System.out.println(mainExample.age());
        System.out.println(mainExample.name());
    }
}

package com.sutton.polymorphism.PrivateOverride;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-19 10:44
 **/
public class PrivateOverride {
    private void f(){
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride privateOverride=new Derived();
        privateOverride.f();
    }
}
class Derived extends PrivateOverride{
    public void f(){
        System.out.println("public f()");
    }
}

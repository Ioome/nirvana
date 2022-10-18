package com.sutton.control.practice;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 初始化顺序
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 14:46
 **/
class Window{
    Window(int market){
        System.out.println("Window("+market+")");
    }
}
class House{
    Window w1=new Window(1);
    House(){
        System.out.println("House()");
        w3=new Window(33);
    }
    Window w2=new Window(2);
    void  f(){
        System.out.println("f()");
    }
    Window w3=new Window(3);

    public static void main(String[] args) {
        House h=new House();
        h.f();
    }
}
public class useInit {

}

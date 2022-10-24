package com.sutton.everythingIsAnObject.scope;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 变量作用域
 * @author: Mr.wang.sutton
 * @create: 2022-10-16 19:42
 **/
public class Scope {

    public static void variableScope() {
        int x = 12;
        //Only  x ariable
        {
          int q=96;
          //Both x & q available
        }
        //errot example
        //Only x available
        //q is  "out of scope"
    }

    public static void main(String[] args) {
        Scope.variableScope();
    }

}

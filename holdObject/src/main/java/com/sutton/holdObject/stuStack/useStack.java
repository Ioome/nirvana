package com.sutton.holdObject.stuStack;

import java.util.Stack;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 后进先出
 * @author: Mr.wang.sutton
 * @create: 2022-10-23 10:19
 **/
public class useStack {

    public static void main(String[] args) {
        Stack<String> strings = new Stack<>();
        for (String s :"My dog has fleas".split("")){
            strings.push(s);
        }
        while (!strings.empty()){
            System.out.println(strings.pop()+" ");
        }
    }
}

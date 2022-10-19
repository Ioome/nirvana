package com.sutton.interfaceclass.processor;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: processor
 * @author: Mr.wang.sutton
 * @create: 2022-10-19 11:15
 **/
public class Processor {
    public String name(){
        return getClass().getSimpleName();
    }

    Object process(Object input){return input;}
}

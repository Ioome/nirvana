package com.sutton.interfaceclass.processor;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: case
 * @author: Mr.wang.sutton
 * @create: 2022-10-19 11:27
 **/
public class Downcase extends Processor{
    @Override
    Object process(Object input) {
        return ((String)input).toLowerCase();
    }
}

package com.sutton.interfaceclass.processor;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: Upcase
 * @author: Mr.wang.sutton
 * @create: 2022-10-19 11:25
 **/
public class Upcase extends Processor{
    @Override
    Object process(Object input) {
        return ((String)input).toUpperCase();
    }
}

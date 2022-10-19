package com.sutton.interfaceclass.processor;

import java.util.Arrays;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: p
 * @author: Mr.wang.sutton
 * @create: 2022-10-19 11:28
 **/
public class Splitter extends Processor{
    @Override
    Object process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}

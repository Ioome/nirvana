package com.sutton.interfaceclass.processor;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: apply
 * @author: Mr.wang.sutton
 * @create: 2022-10-19 11:30
 **/
public class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Proccessor" + p.name());
        System.out.println(p.process(s));
    }

    public static String s = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }

}

package org.example.uselombok;

import java.util.Set;

import lombok.Builder;
import lombok.Singular;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-11-02 15:27
 **/
@Builder
public class UseBuilder {
    @Builder.Default
    private long created = System.currentTimeMillis();
    private String name;
    private int age;
    @Singular
    private Set<String> occupations;

    public static void main(String[] args) {
        UseBuilder hello = UseBuilder.builder().name("hello").build();
        System.out.println(hello.name);
    }
}

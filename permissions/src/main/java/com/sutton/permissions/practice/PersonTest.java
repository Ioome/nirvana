package com.sutton.permissions.practice;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 测试
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 17:14
 **/
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(1000);
        System.out.println(person.getAge());
    }
}

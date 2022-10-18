package com.sutton.permissions.practice;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 人
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 17:13
 **/
public class Person {

    private  int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=0 && age<=130) {
            this.age = age;
        }else{
            System.out.println("输入有误");
        }
    }
}

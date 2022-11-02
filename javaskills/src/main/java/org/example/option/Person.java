package org.example.option;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 使用 Option 去判断 null
 * @author: Mr.wang.sutton
 * @create: 2022-11-02 09:34
 **/
public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

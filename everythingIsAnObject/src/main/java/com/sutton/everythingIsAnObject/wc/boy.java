package com.sutton.everythingIsAnObject.wc;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 男
 * @author: Mr.wang.sutton
 * @create: 2022-10-17 09:12
 **/
public class boy {

    /**
     * 性别
     */
    private String name;

    /**
     *  年龄
     */
    private Integer age;

    /**
     *
     * @return
     */
    private String  sex="男";

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

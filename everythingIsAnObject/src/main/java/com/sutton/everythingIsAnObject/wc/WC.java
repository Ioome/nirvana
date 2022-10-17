package com.sutton.everythingIsAnObject.wc;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 厕所
 * @author: Mr.wang.sutton
 * @create: 2022-10-17 09:14
 **/
public class WC {
    public static void main(String[] args) {
        boy boy1=new boy();
        boy1.setAge(18);
        boy1.setName("小黑子");
        boy1.setSex("男");
        if(boy1.getSex()!=SCHOOLWC.boy){
            System.out.println("臭流氓");
        }else {
            System.out.println("嘘........");
        }
    }
}

package com.sutton.everythingIsAnObject.tv;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 遥控器类
 * @author: Mr.wang.sutton
 * @create: 2022-10-15 16:29
 **/
public class remote implements remoteService{

    @Override
    public void open(Tv tv) {
        tv.say();
        System.out.println(tv.getClass()+" "+tv.hashCode());
    }
}

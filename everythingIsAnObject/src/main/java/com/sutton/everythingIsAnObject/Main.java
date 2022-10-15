package com.sutton.everythingIsAnObject;

import com.sutton.everythingIsAnObject.tv.HP;
import com.sutton.everythingIsAnObject.tv.xiaomi;
import com.sutton.everythingIsAnObject.tv.remote;
/**
 * @author loome
 * @version 1.0.1
 * @date
 * @description this is a java file
 **/
public class Main {
    public static void main(String[] args) {
        //惠普电视机
        HP hp=new HP();
        //小米电视机
        xiaomi x=new xiaomi();
        //遥控器
        remote remote=new remote();
        //操纵不同的电视机
        remote.open(x);
        //操纵 HP
        remote.open(hp);
    }
}
package com.sutton.everythingIsAnObject.box;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 卡里怕盒子
 * @author: Mr.wang.sutton
 * @create: 2022-10-16 20:06
 **/
public class kkalipaaBox {

    /**
     *  盒子有个卡里怕名字
     */
    private  String  kkalipaaName;

    /**
     *  卡里怕动作
     */
    public String getKkalipaaName() {
        return kkalipaaName;
    }

    public void setKkalipaaName(String kkalipaaName) {
        this.kkalipaaName = kkalipaaName;
    }

    public static void main(String[] args) {
        kkalipaaBox kkalipaaBox=new kkalipaaBox();
        System.out.println(kkalipaaBox.getKkalipaaName());
    }
}

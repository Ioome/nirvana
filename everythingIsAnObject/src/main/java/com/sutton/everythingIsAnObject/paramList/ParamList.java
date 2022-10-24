package com.sutton.everythingIsAnObject.paramList;

import java.math.BigDecimal;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 方法参数
 * @author: Mr.wang.sutton
 * @create: 2022-10-17 08:07
 **/
public class ParamList {

    /**
     *  商店的泡面
     *  默认:4.0
     */
    private  BigDecimal instantNoodles=new BigDecimal(4.0);

    /**
     * 商店进行涨价的动作
     * @param price
     * @return
     */
    double priceIncrease(BigDecimal price){
        return instantNoodles.subtract(new BigDecimal(0.2)).doubleValue();
    }

    public BigDecimal getInstantNoodles() {
        return instantNoodles;
    }

    public void setInstantNoodles(BigDecimal instantNoodles) {
        this.instantNoodles = instantNoodles;
    }

    public static void main(String[] args) {
        ParamList shopping=new ParamList();
        shopping.priceIncrease(new BigDecimal(20));
        System.out.println("泡面涨价了🤑 "+shopping.getInstantNoodles());

    }
}

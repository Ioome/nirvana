package com.sutton.holdObject.stuList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 内存蟹肉查看
 * @author: Mr.wang.sutton
 * @create: 2022-10-20 22:41
 **/
public class useOrderService {

    public static void main(String[] args) {
        useOrderService useOrderService = new useOrderService();
        useOrderService.process();
    }

    /**
     * 里面有处理数据的逻辑
     */
    public void process() {
        //数据返回到这里面
        List<Long> orderIdList = queryOrder();
        //生成一个 失败单号
        List<List<Long>> allFailedList = new ArrayList<>();
        //再循环 Integer
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            System.out.println(i);
            //做逻辑
            List<Long> failedList = doProcess(orderIdList);
            allFailedList.add(failedList);
        }
    }

    /**
     * 难点
     * @param orderIdList
     * @return
     */
    private List<Long> doProcess(List<Long> orderIdList) {

        //生成一个 失败列表
        List<Long> failedList = new ArrayList<>();
        //返回余数
        for (Long orderId : failedList) {
            if (orderId % 2 == 0) {
                failedList.add(orderId);
            }
        }
        return failedList.subList(0,1);
    }

    /**
     * 产生一个随机数集合
     *
     * @return
     */
    private List<Long> queryOrder() {
        Random random = new Random(100);
        //产生一个 动态数组
        List<Long> orderIdList = new ArrayList<>();
        //循环1000
        for (int i = 0; i < 1000; i++) {
            orderIdList.add(random.nextLong());
        }
        //返回
        return orderIdList;
    }
}

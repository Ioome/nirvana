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
        List<Long> orderIdList = queryOrder();
        List<List<Long>> allFailedList = new ArrayList<>();
        for(int i = 0; i < Integer.MAX_VALUE; i++) {
            System.out.println(i);
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

        List<Long> failedList = new ArrayList<>();
        for (Long orderId : orderIdList) {
            if (orderId % 2 == 0) {
                failedList.add(orderId) ;
            }
        }
        // 只取一个失败的订单id做分析
        return failedList.subList(0, 1);
    }

    /**
     * 产生一个随机数集合
     *
     * @return
     */
    private List<Long> queryOrder() {
        Random  random=new Random(100);
        List<Long> orderIdList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            orderIdList.add(random.nextLong());
        }
        return orderIdList;
    }
}

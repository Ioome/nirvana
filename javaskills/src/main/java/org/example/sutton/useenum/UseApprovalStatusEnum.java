package org.example.sutton.useenum;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 使用 ApprovalStatusEnum 枚举类
 * @author: Mr.wang.sutton
 * @create: 2022-11-02 16:13
 **/
public class UseApprovalStatusEnum {
    public static void main(String[] args) {
        System.out.println(ApprovalStatusEnum .START.getNextStatus().getNextStatus().getNextStatus().getMsg());
    }
}

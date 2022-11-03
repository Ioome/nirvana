package org.example.sutton.useenum;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 状态转移术
 * @author: Mr.wang.sutton
 * @create: 2022-11-02 16:09
 **/
@Getter
@AllArgsConstructor
public  enum ApprovalStatusEnum {


    /**
     * 起点
     */
    START(1,"开始审批"){
        @Override
        ApprovalStatusEnum getNextStatus ()
        {
            return first_leader;
        }
    },

    /**
     * 领导审批
     */
    first_leader(2,"第一个领导审批"){
        @Override
        ApprovalStatusEnum getNextStatus ()
        {
            return second_leader;
        }
    },

    second_leader(3,"第二个领导"){
        @Override
        ApprovalStatusEnum getNextStatus ()
        {
            return second_leader;
        }
    };
    private Integer code;
    private String msg;

    abstract ApprovalStatusEnum getNextStatus();

}

package org.example.sutton.useenum;

import java.util.HashMap;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 使用枚举类型
 * @author: Mr.wang.sutton
 * @create: 2022-11-02 15:58
 **/
public class UserEnum {


    @Getter
    @AllArgsConstructor
    public enum Sex {
        /**
         * 1,男人
         */
        Man(1, "男"),
        /**
         * 2,女人
         */
        WOMAN(2, "女");
        /**
         * 性别对应的编码
         */
        private Integer code;
        /**
         * 性别
         */
        private String msg;
        /**
         * 这什么意思
         */
        private static HashMap<Integer, Sex> data = new HashMap<Integer, Sex>();

        /**
         * set 值到 data
         */
        static {
            for (Sex d : Sex.values()) {
                data.put(d.code, d);
            }
        }

        /**
         * 前端状态转换
         * @param code 性别对应的编码
         * @return 返回性别
         */
        public static Sex parse(Integer code) {
            if (data.containsKey(code)) {
                return data.get(code);
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Sex parse=Sex.parse(1);
        System.out.println(parse.getCode());
    }
}

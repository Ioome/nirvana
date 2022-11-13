package org.example.usejdbc.operation.excutequerymysql;

import lombok.Data;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 用户类
 * @author: Mr.wang.sutton
 * @create: 2022-11-10 21:02
 **/
@Data
public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private String email;
}

package org.example.usejdbc.precondition;

import org.example.usejdbc.constants.DataPropertiesConstants;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 加载驱动并且获取连接
 * @author: Mr.wang.sutton
 * @create: 2022-11-10 17:45
 **/
public class LoadJdbc {

    /**
     * 根据 URL USER PASSWORD 获取连接
     */
    @Test
    public void getConnection() throws SQLException {
        System.out.println("-------获取连接-------");
        Connection connection = DriverManager.getConnection(DataPropertiesConstants.URL, DataPropertiesConstants.USER, DataPropertiesConstants.PASSWORD);
        System.out.println("南方的牧场机器人为你获取到: " + connection);
        System.out.println("获取成功");
    }

}

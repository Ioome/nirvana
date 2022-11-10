package org.example.usejdbc.util;

import org.example.usejdbc.constants.DataPropertiesConstants;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 加载驱动器
 * @author: Mr.wang.sutton
 * @create: 2022-11-10 20:19
 **/
public class loadDriver {

    /**
     * loadDriver() 方法用于加载驱动
     */
    public static void loadDriver() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 加载方式1
     */
    @Test
    public void loadDriverMethod$1() {
        //通过 new 对象的方式去创建
        Driver driver = null;
        try {
            driver = new com.mysql.cj.jdbc.Driver();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //存放在容器
        Properties info = new Properties();
        info.setProperty("user", "root");
        info.setProperty("password", "9978@wzb");
        try {
            System.out.println("------获取连接------");
            Connection connection = driver.connect(DataPropertiesConstants.URL, info);
            System.out.println("获取连接成功: " + connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Test
    /**
     * 通过反射 __new__ 一个 Driver
     */
    public void getConnectMethodThree() {
        //通过 new 对象的方式去创建
        Driver driver = null;
        try {
            Class clazzDriver = Class.forName(DataPropertiesConstants.CLASS_NAME);
            driver = (Driver) clazzDriver.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //存放在容器
        Properties info = new Properties();
        info.setProperty("user", "root");
        info.setProperty("password", "9978@wzb");
        try {
            System.out.println("------获取连接------");
            Connection connection = driver.connect(DataPropertiesConstants.URL, info);
            System.out.println("获取连接成功: " + connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


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

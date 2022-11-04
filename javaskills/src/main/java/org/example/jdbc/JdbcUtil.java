package org.example.jdbc;

import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.util.Properties;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: JDBC工具类
 * @author: Mr.wang.sutton
 * @create: 2022-11-03 20:14
 **/
public class JdbcUtil {


    /**
     * 驱动
     */
    private String driverClass = null;
    /**
     * url
     */
    private String jdbcUrl = null;

    /**
     * 用户名
     */
    private String user = null;
    /**
     * 密码
     */
    private String password = null;

    /**
     * 获取Connection
     * 1. 读取配置文件的信息
     * 2. 加载驱动
     * 3. 返回 Connection
     *
     * @return 返回 mysql 链接
     * @throws Exception
     */
    public Connection getConnection() throws Exception {
        InputStream in = getClass().getClassLoader().getResourceAsStream("jdbc.properties");
        //通过流加载配置文件
        Properties propertie = new Properties();
        //加载
        propertie.load(in);
        //获取文件的内容信息
        jdbcUrl = propertie.getProperty("jdbcurl");
        user = propertie.getProperty("url");
        password = propertie.getProperty("password");
        //加载驱动
        Driver driver = (Driver) Class.forName(driverClass).newInstance();
        Properties info = new Properties();
        info.put("user", user);
        info.put("password", password);
        Connection connection = driver.connect(jdbcUrl, info);
        return connection;
    }

    @Test
    public void testGetConnection() throws Exception{
        System.out.println(getConnection());
    }
}

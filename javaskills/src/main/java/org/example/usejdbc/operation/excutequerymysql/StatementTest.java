package org.example.usejdbc.operation.excutequerymysql;

import org.example.usejdbc.util.loadDriver;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;
import java.util.Properties;
import java.util.Scanner;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 使用 statement
 * @author: Mr.wang.sutton
 * @create: 2022-11-10 20:53
 **/
public class StatementTest {


    /**
     * 用户登录
     */

    public static void testLogin() {
        //输入
        Scanner scan = new Scanner(System.in);
        System.out.println("用户名:  ");
        //用户名
        String userName = scan.nextLine();
        System.out.println("密码:  ");
        //密码
        String password = scan.nextLine();
        String sql = "SELECT id,userName,passWord,email FROM user WHERE userName = '" + userName + "' AND passWord = '" + password + "'";
        User user = get(sql, User.class);
        if (!Objects.isNull(user)) {
            System.out.println("账户存在");
        } else {
            System.out.println("账户密码错误");
        }
        System.out.println("--------- 更新 --------------");
        String updateUser = "UPDATE user SET  userName='hello github' WHERE  id=?";
        System.out.println("---------- 传入更新人id --------------");
        Scanner inUserId = new Scanner(System.in);
        Integer userId = inUserId.nextInt();
        update(updateUser, userId);
    }

    /**
     * 通过 preparedStatement 去更新数据
     *
     * @param sql  sql 语句
     * @param args 传递参数
     */
    public static void update(String sql, Object... args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = loadDriver.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                preparedStatement.setObject(i + 1, args[i]);
            }
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * @param sql   输入 sql
     * @param clazz 实体类
     * @param <T>
     * @return 返回实体类
     */
    public static <T> T get(String sql, Class<T> clazz) {
        //实体类
        T t = null;

        /**
         * 连接
         */
        Connection connection = null;
        /**
         * 用于执行静态 SQL 语句并返回它所生成结果的对象
         */
        Statement statement = null;
        /**
         * 返回结果集
         */
        ResultSet resultSet = null;

        try {
            InputStream inputStream = StatementTest.class.getClassLoader().getResourceAsStream("JDBC.properties");
            Properties properties = new Properties();
            //加载外部
            properties.load(inputStream);

            //获取密码
            String user = properties.getProperty("user");
            String password = properties.getProperty("password");
            String url = properties.getProperty("url");
            String driverClass = properties.getProperty("className");

            //加载驱动
            Class.forName(driverClass);

            //获取连接
            connection = DriverManager.getConnection(url, user, password);

            //获取执行器
            statement = connection.createStatement();

            //执行器执行xql 获取到 sql
            resultSet = statement.executeQuery(sql);

            //获取结果集元数据
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

            int columnCount = resultSetMetaData.getColumnCount();
            if (resultSet.next()) {
                t = clazz.newInstance();
                for (int i = 0; i < columnCount; i++) {

                    //1.获取列名
                    String columnName = resultSetMetaData.getColumnLabel(i + 1);

                    Object columnVal = resultSet.getObject(columnName);


                    Field field = clazz.getDeclaredField(columnName);
                    field.setAccessible(true);
                    field.set(t, columnVal);
                }
            }
            return t;
        } catch (Exception e) {

        } finally {

        }

        return null;
    }

    public static void main(String[] args) {
        StatementTest.testLogin();
    }
}

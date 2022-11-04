package org.example.lambdause.java2;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 员工数据
 * @author: Mr.wang.sutton
 * @create: 2022-11-04 15:08
 **/
public class EmployeeData {

    public static List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1001, "马化腾", 34, 6000.38));
        list.add(new Employee(1002, "马云", 12, 6000.38));
        list.add(new Employee(1003, "刘强东", 33, 6000.38));
        list.add(new Employee(1004, "雷军", 26, 6000.38));
        list.add(new Employee(1005, "李彦宏", 65, 6000.38));
        list.add(new Employee(1006, "马比尔盖茨", 42, 6000.38));
        list.add(new Employee(1007, "扎克伯格", 26, 6000.38));
        list.add(new Employee(1001, "马斯克", 35, 6000.38));
        return list;
    }
}
package org.example.lambdause.java2;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 终止操作
 * @author: Mr.wang.sutton
 * @create: 2022-11-04 17:19
 **/
public class StreamApiTest3 {

    @Test
    public void test1() {
        List<Employee> employees = EmployeeData.getEmployees();
        boolean b = employees.stream().allMatch(employee -> employee.getAge() > 18);
        System.out.println(b);
        boolean b1 = employees.stream().anyMatch(employee -> employee.getAge() > 18);
        System.out.println(b1);
        Optional<Employee> employee=employees.stream().findFirst();
    }
}

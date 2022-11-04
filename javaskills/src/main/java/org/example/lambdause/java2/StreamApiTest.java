package org.example.lambdause.java2;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: Stream 使用
 * @author: Mr.wang.sutton
 * @create: 2022-11-04 16:29
 **/
public class StreamApiTest {

    /**
     * 创建流的四种方式
     */
    @Test
    public void test() {
        List<Employee> employee = EmployeeData.getEmployees();
        Stream<Employee> stream = employee.stream();
        Stream<Employee> stream1 = employee.parallelStream();

        Stream.iterate(0, t -> t + 2).limit(10).forEach(System.out::println);
        Stream.iterate(0,t->t+2).limit(10).forEach(s-> System.out.println(s));
    }


}

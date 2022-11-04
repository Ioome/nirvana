package org.example.lambdause.java2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-11-04 16:40
 **/
public class StreamApi {

    /**
     * 筛选与切片
     */
    @Test
    public void test() {
        List<Employee> list = EmployeeData.getEmployees();
        Stream<Employee> stream = list.stream();
        //查询员工表中薪资大于 7000 的 员工信息
        stream.filter(e -> e.getSalary() > 7000).forEach(System.out::println);
        list.stream().limit(3).forEach(System.out::println);
        System.out.println("---------");
        list.stream().skip(3).forEach(System.out::println);
        System.out.println("------------");
        list.stream().distinct().forEach(System.out::println);
    }

    /**
     * test
     */
    @Test
    public void test1() {
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        list.stream().map(str -> str.toUpperCase()).forEach(System.out::println);
        List<Employee> employees = EmployeeData.getEmployees();
        Stream<String> collect = employees.stream().map(Employee::getName);
        collect.filter(name -> name.length() > 3).forEach(System.out::println);

        Stream<Stream<Character>> streamStream = list.stream().map(StreamApi::fromStringToStream);
        streamStream.forEach(s -> {
            s.forEach(System.out::println);
        });

        Stream<Character> characterStream=list.stream().flatMap(StreamApi::fromStringToStream);
        characterStream.forEach(System.out::println);
    }

    /**
     * 多个字符构成的集合转化为对应的 Stream 实例
     *
     * @param str
     * @return
     */
    public static Stream<Character> fromStringToStream(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (Character c : str.toCharArray()) {
            list.add(c);
        }
        return list.stream();
    }

    @Test
    public void test3() {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        ArrayList list2 = new ArrayList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list.add(list2);
        System.out.println(list);

    }
}

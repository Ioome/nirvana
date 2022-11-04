package org.example.lambdause.java2;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-11-04 15:12
 **/
public class MethodRefTest {


    /**
     * 实例方法
     * Consumer 中的 void accept(T t)
     * PringStream 中的 void println(T t)
     */
    @Test
    public void test1() {
        Consumer<String> con1 = str -> System.out.println(str);
        con1.accept("北京");

        System.out.println("--------");
        Consumer<String> con2 = System.out::println;
        con2.accept("beijing");
    }


    /**
     * Supplier T get()
     * Employee String getName()
     */
    @Test
    void test2() {
        Employee emp = new Employee(1001, "tom", 23, 5600);
        Supplier<String> sup = () -> emp.getName();
        System.out.println(sup.get());

        System.out.println("------------");
        Supplier<String> sup2 = emp::getName;
        System.out.println(sup2.get());
    }

    @Test
    void test3() {
        Comparator<Integer> com1 = Integer::compare;
        System.out.println(com1.compare(12, 3));
    }

    @Test
    void test4() {
        Function<Double, Long> func = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        System.out.println("-------------");
        Function<Double, Long> func1 = d -> Math.round(d);
        System.out.println("-------------");
        Function<Double, Long> func2 = Math::round;
        System.out.println(func2.apply(12.00));
    }

    @Test
    void test5() {
        Comparator<String> com1 = (s1, s2) -> s1.compareTo(s2);
        com1.compare("abc", "abc");
        Comparator<String> com2 = String::compareTo;
        System.out.println(com2.compare("hello", "hello"));

        BiPredicate<String, String> pre2 = String::equals;
        pre2.test("abc", "abc");
        Function<Employee,String> func1=e-> e.getName();
    }

    void test6(){
        Supplier<Employee> supplier=()->new Employee();
        System.out.println("-----------");
        Supplier<Employee> supplier1=Employee::new;
    }
}

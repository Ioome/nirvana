package org.example.lambdause;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 使用  lambda 表达式
 * @author: Mr.wang.sutton
 * @create: 2022-11-04 11:45
 **/

@FunctionalInterface
interface Print<T> {
    public void print(T x);
}

@FunctionalInterface
interface Animal {
    void eat();
}

/**
 * 反编译之后的代码
 */
class Lambda$$0 implements Print<String> {
    @Override
    public void print(String x) {
        System.out.println(x);
    }
}

public class LambdaTest {


    public static void PrintString(String s, Print<String> print) {
        print.print(s);
    }

    @Test
    public void useInnerAndLambda() {
        Animal animal = new Animal() {
            @Override
            public void eat() {
                System.out.println("内部类使用");
            }
        };
        animal.eat();
        System.out.println("--------- lambda--------");
        Animal animal1 = () -> {
            System.out.println("lamabda");
        };
        animal1.eat();
    }

    final class Lambda$$0 implements Print<String> {

        /**
         * @param x
         */
        @Override
        public void print(String x) {
            System.out.println(x);
        }
    }

    @Test
    public void test() {
        /**
         * 匿名内部类从语法告诉我，它是有一个类实现了此接口，形式上发生了改变
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        };
        runnable.run();
    }

    @Test
    public void test1() {
        Runnable runnable = () -> System.out.println("hello github");
        runnable.run();
    }

    @Test
    public void test2() {
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("hello github...🔪🔪🔪");
        System.out.println("------------  lambda ----------");
        Consumer<String> consumer = (String s) -> System.out.println(s);
        consumer.accept("hello");
        System.out.println("------------  lambda ----------- ");
        Consumer<String> consumer2 = (s) -> System.out.println(s);
        consumer2.accept("类型推断");
    }

    @Test
    public void test6() {
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(com1.compare(1, 2));
        System.out.println("---------- lambda");
        Comparator<Integer> comparator = (x, y) -> {
            return x.compareTo(y);
        };
        System.out.println(comparator.compare(1, 2));
    }


    public static void main(String[] args) {
        PrintString("hello github", (x) -> System.out.println(x));
        PrintString("test inner", new LambdaTest().new Lambda$$0());
    }
}

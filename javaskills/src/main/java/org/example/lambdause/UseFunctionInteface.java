package org.example.lambdause;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 使用四大函数式接口
 * Consumer<T>  void accept(T t)
 * Supplier<T>  T get()
 * Function<T>  R apply(T t)
 * Predicate<T> boolean test(T t)
 * @author: Mr.wang.sutton
 * @create: 2022-11-04 14:49
 **/
public class UseFunctionInteface {

    @Test
    public void useConsumer() {
        /**
         * 内部类
         */
        happyTime(100.00, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("金额" + aDouble);
            }
        });
        System.out.println("------ lambda -------");
        happyTime(20.00, (t) -> {
            System.out.println("金额" + t);
        });
    }

    @Test
    public void filter() {
        List<String> name = Arrays.asList("hello", "github", "meko", "nihaos", "gg", "h");
        ArrayList arrayList = filterString(name, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("g");
            }
        });

        ArrayList arrayList1 = filterString(name, (s) -> {
            return s.contains("h");
        });
        arrayList1.stream().forEach(s -> System.out.println(s));
        System.out.println("-------- inner ---------");
        arrayList.stream().forEach(s -> System.out.println(s));
    }

    public void happyTime(double money, Consumer<Double> con) {
        con.accept(money);
    }

    public ArrayList filterString(List<String> filter, Predicate<String> predicate) {
        ArrayList list = new ArrayList();

        for (String s : filter) {
            if (predicate.test(s)) {
                list.add(s);
            }
        }
        return list;
    }

}

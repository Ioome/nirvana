package org.example.hashmapiteration;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: Hash 7 种迭代
 * @author: Mr.wang.sutton
 * @create: 2022-11-02 10:23
 **/
@BenchmarkMode(Mode.AverageTime) // 测试完成时间
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 2, time = 1, timeUnit = TimeUnit.SECONDS) // 预热 2 轮，每次 1s
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS) // 测试 5 轮，每次 1s
@Fork(1) // fork 1 个线程
@State(Scope.Thread) // 每个测试线程一个实例
public class iterationUtil {
    /**
     * 今天的主角
     */
    Map<Integer, String> map = new HashMap();

    /**
     * set
     *
     * @param map 对象调用
     */
    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    /**
     * 赋值操作
     */
    public void assignment() {
        map.put(1, "Java");
        map.put(2, "JDK");
        map.put(3, "Spring Framework");
        map.put(4, "MyBatis framework");
        map.put(5, "Java中文社群");
    }

    /**
     * @return 返回此对象迭代器
     */
    public Iterator<Map.Entry<Integer, String>> getIterator() {
        return map.entrySet().iterator();
    }

    /**
     * 使用迭代器（Iterator）EntrySet 的方式进行遍历；
     */
    @Benchmark
    public void useEntrySet() {
        /**
         * 相当于获取了一个HashMap 元素，并且  Iterator 指向了 它.
         */
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    /**
     * 使用迭代器（Iterator）KeySet 的方式进行遍历；
     * 此方法是获取 key 的方式,
     */
    @Benchmark
    public void useKeySet() {
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println(key);
            System.out.println(map.get(key));
        }
    }

    /**
     * 使用 For Each EntrySet 的方式进行遍历
     * 原理也是通过获取 hash 元素去处理
     */
    @Benchmark
    public void useForEach() {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    /**
     * 使用 For Each KeySet 的方式进行遍历；
     * 获取到 key
     */
    @Benchmark

    public void useForEachEntryKey() {
        for (Integer key : map.keySet()) {
            System.out.println(key);
            System.out.println(map.get(key));
        }
    }

    /**
     * 使用 Lambda 表达式的方式进行遍历；
     */
    @Benchmark

    public void useLambda() {
        map.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);
        });
    }

    /**
     * 使用 Streams API 单线程的方式进行遍历；
     */
    @Benchmark
    public void useStream() {
        map.entrySet().stream().forEach((entry) -> {
            System.out.println(entry.getValue());
            System.out.println(entry.getKey());
        });
    }

    /**
     * 使用 Streams API 多线程的方式进行遍历。
     */
    @Benchmark
    public void useParallelStream() {
        map.entrySet().parallelStream().forEach((entry) -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });
    }

    /**
     * 使用迭代器删除元素
     */
    public void removeElementUseIterator() {
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            if (entry.getKey() == 1) {
                System.out.println("del:" + entry.getKey());
                iterator.remove();
            } else {
                System.out.println("show:" + entry.getKey());
            }
        }
    }

    /**
     * lambda
     */
    public void removeElementUseLambda(){
        map.forEach((key, value) -> {
            if (key == 1) {
                System.out.println("del:" + key);
                map.remove(key);
            } else {
                System.out.println("show:" + key);
            }
        });
    }

    public static void main(String[] args) throws RunnerException {
        iterationUtil util = new iterationUtil();
        util.assignment();
        util.useStream();
        util.removeElementUseLambda();
        // 启动基准测试
//        Options opt = new OptionsBuilder()
//                // 要导入的测试类
//                .include(iterationUtil.class.getSimpleName()).output("jmh-map.log") // 输出测试结果的文件
//                .build();
//        new Runner(opt).run(); // 执行测试


    }
}

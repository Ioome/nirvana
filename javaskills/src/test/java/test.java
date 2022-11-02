import org.example.clearif.util.VUtils;
import org.example.option.Person;
import org.junit.Test;

import java.util.Optional;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 测试点
 * @author: Mr.wang.sutton
 * @create: 2022-11-02 09:23
 **/
public class test {


    /**
     * 测试函数式接口处理 抛出异常
     */
    @Test
    public void isTrue() {
        VUtils.isTure(true).throwMessage("hello world");
    }


    @Test
    public void isTrueOrFalse() {
        VUtils.isTureOrFalse(true).trueOrFalseHandle(() -> {
            System.out.println("hello github");
        }, () -> {
            System.out.println("nonono  hello gitee");
        });
    }


    @Test
    public void useNPE() {
        //对象 人
        //属性有 name，age
        Person person = new Person();
        if (null == person) {
            System.out.println("person为null");
        }
        System.out.println(person);
    }

    @Test
    public void useOptional() {
        Person person = new Person();
        person.setAge(60);
        Optional<String> optionalS=Optional.empty();
        Optional<String> optionalS1=Optional.of("hello");
        Optional<String> optOfNullable1 = Optional.ofNullable(null);
        Optional<String> optOfNullable2 = Optional.ofNullable("optional");
        Optional.ofNullable(person).ifPresent(p -> System.out.println("年龄"+p.getAge()));
        String optname=Optional.ofNullable(person).map(Person::getName).orElse("hello");
        System.out.println(optname);
        System.out.println( Optional.ofNullable(person).filter(p -> p.getAge()>50));
    }


}

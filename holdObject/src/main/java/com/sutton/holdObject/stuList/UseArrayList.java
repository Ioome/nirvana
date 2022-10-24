package com.sutton.holdObject.stuList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 使用ArrayLisrt
 * @author: Mr.wang.sutton
 * @create: 2022-10-20 17:23
 **/
public class UseArrayList {

    public static void main(String[] args) {
        //声明一个指定的 ArrayList
        ArrayList<String> cars = new ArrayList<>();
        //添加项目
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Volvo");
        cars.set(0,"BMW");
        Iterator var2 = cars.iterator();

        while(var2.hasNext()) {
            String str = (String)var2.next();
            if ("Volvo".equals(str)) {
                cars.remove(str);
            }
        }




        System.out.println(cars);
        //访问项目
        System.out.println(cars.get(0));
        //更改
        System.out.println(cars.set(0, "hello"));
        System.out.println(cars);
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        Iterator it=cars.iterator();
        Collections.shuffle(cars);
        for (String i : cars) {
            System.out.println(i);
        }
    }
}

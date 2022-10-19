# 知识点
1. 组合
```java
package com.sutton.Reuse.combination;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: Composition for code reuse
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 17:47
 **/
public class WaterSource {
    private String s;

    public WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return "WaterSource{" +
                "s='" + s + '\'' +
                '}';
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklerSystem = new SprinklerSystem();
        System.out.println(sprinklerSystem);
    }

}

class SprinklerSystem {
    private String value1, value2, value3, value4;
    private WaterSource source = new WaterSource();

    private int i;

    private float f;

    @Override
    public String toString() {
        return "SprinklerSystem{" +
                "value1='" + value1 + '\'' +
                ", value2='" + value2 + '\'' +
                ", value3='" + value3 + '\'' +
                ", value4='" + value4 + '\'' +
                ", source=" + source +
                ", i=" + i +
                ", f=" + f +
                '}';
    }
}

```

继承
1. 关键字
2. 初始化基类.super():初始化
3. 代理: 代理模式
4. 结合使用组合和继承:组合和继承
5. 确保正确清理：finilize
6. 名称屏蔽:覆盖
7. 组合和继承之间选择:is-a has-a
8. protected:子类可使用
9. 向上转型:子类和父类的关系.
10. 为什么称向上转型
11. final: 对象引用被 final 不可改变
12. 初始化及类的加载
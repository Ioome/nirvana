
<p align=center>
  <a href="https://www.talkxj.com">
    <img src="https://refactoringguru.cn/images/patterns/diagrams/adapter/solution-zh.png" alt="风丶宇的个人博客" style="border-radius: 30%">
  </a>
</p>



# 适配器模式
--- 
##### 😁 问题产生
不同对象之间是不兼容的，我们需要一个适配器进行转换，适用于生活中.充电接口,假设我们是苹果🍎充电接口,但是现在我们只有一个安卓的接口，那么我们如何做到安卓线接口为苹果充电接口进行连接呢？


### 解决方案
我们在这两个接口之间创建第三者，**创建一个适配器** 用于将不同的对象转换.比如上面的问题，我们可以把安卓接口转换为苹果接口,那么适配器要做的是提供一个苹果线接口，那么的话就可以做到为苹果接口充电并连接了.
 
 

 ### 适配器的种类
1. 单向适配器
2. 双向适配器
   

UML
<p align=center>
  <a href="https://www.talkxj.com">
    <img src="https://refactoringguru.cn/images/patterns/diagrams/adapter/structure-object-adapter.png" alt="风丶宇的个人博客" style="border-radius: 1%">
  </a>
</p>



# 实现

Mobile.java
```
public class mobile {
    // 这里传入的是 v5接口,实现了这个接口的类也可以传入
    public void inputPower(V5Power v5Power) {
        int provideV5Power = v5Power.provideV5Power();
        Log.e("---", "手机(客户端): 我需要的是5V电压充电,现在是" + provideV5Power + "V");
    }

}

```
V5Power.java

```

public interface V5Power {
    public int provideV5Power();
}   

```
V220Power.java
```

public class v220power {
    public int provideV220Power() {
        Log.e("---", "现有类: 我们提供的是220v的家用电");
        return 220;
    }
}

```
V5PowerAdapter.java
```
public class V5PowerAdapter implements V5Power{
    private int v220power;

    public V5PowerAdapter(V220Power v220Power) {
        v220power = v220Power.provideV220Power();
    }

    
    @Override
    public int provideV5Power() {

        Log.e("---", "适配器: 经过复杂的操作,将" + v220power + "v电压转为5v");
        return 5;
    }

}

```
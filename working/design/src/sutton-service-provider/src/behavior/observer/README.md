# 观察者模式 eys👀
对象之间的一对多的依赖.**首对象** 发生改变时候.依赖对象将会受到一定的通知并自动更新


### 🥲问题
假如你有两种类型的对象： ​ 顾客和 商店 。 顾客对某个特定品牌的产品非常感兴趣 （例如最新型号的 iPhone 手机）， 而该产品很快将会在商店里出售。

<p align=center>
  <a href="https://www.talkxj.com">
    <img src="https://refactoringguru.cn/images/patterns/content/observer/observer-comic-1-zh.png" alt="风丶宇的个人博客" style="border-radius: 30%">
  </a>
</p>

顾客可以每天来商店看看产品是否到货。 但如果商品尚未到货时， 绝大多数来到商店的顾客都会空手而归
我们似乎遇到了一个矛盾： 要么让顾客浪费时间检查产品是否到货， 要么让商店浪费资源去通知没有需求的顾客


--- 
1、被关注的对象称做发布者，功能就是推送消息，同时它是被观察者窥视的👀,我们举个例子就很清楚了，我们上班的地方通常是存在摄像头的,老板无时无刻在观察我们,老板看到谁在摸鱼🐊,老板就能立马收到一定的 **消息** 员工就是发布者,老板就是订阅者

2、观察者只需要订阅主题，只要有新的消息就会送来





## Demo 


Observer.java
```
/**
 * 所有观察者需要实现的接口🤔
 */
public interface Observer {

    void update(String msg);

}

```
--- 
SubjectService.java
```

/**
 * 推送者
 */
public interface SubjectService {

    /**
     * 注册观察者
     * 
     * @param observer
     */
    void registerObservers(Observer observer);

    /**
     * 移动观察者
     * 
     * @param observer
     */
    void removeObservers(Observer observer);

    /*
     * 消息推送接口
     */
    void notifyObservers();
}

```

主要实现类,控制观察者注册 移除,消息推送
```
public class Object3D implements SubjectService {

    private List<Observer> observers = new ArrayList<>();

    /**
     * 3D 彩票的号码
     */
    private String lotteryMsg;

    @Override
    public void registerObservers(Observer observer) {
        // TODO Auto-generated method stub
        // 注册观察者
        observers.add(observer);
    }

    @Override
    public void removeObservers(Observer observer) {
        // TODO Auto-generated method stub
        // 移除观察者
        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        // TODO Auto-generated method stub
        for (Observer observer : observers) {
            observer.update(lotteryMsg);
        }
    }

    public void setMsg(String lotteryMsg) {
        this.lotteryMsg = lotteryMsg;
        notifyObservers();
    }

}

```

观察注册
```
public class Observer1 implements Observer {

    private SubjectService subjectService;

    public Observer1(SubjectService subjectService) {
        this.subjectService = subjectService;
        subjectService.registerObservers(this);
    }

    @Override
    public void update(String lotteryMsg) {
        // TODO Auto-generated method stub
        System.out.println("observer1 得到 3D 号码 -->" + lotteryMsg);
    }
}
```
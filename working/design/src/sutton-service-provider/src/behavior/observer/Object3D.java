import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

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

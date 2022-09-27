
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

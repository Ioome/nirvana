import org.omg.CORBA.PRIVATE_MEMBER;

public class Observer2 implements Observer {

    private SubjectService service;

    public Observer2(SubjectService service) {
        this.service = service;
        service.registerObservers(this);
    }

    @Override
    public void update(String lotteryMsg) {
        // TODO Auto-generated method stub
        System.out.println("observer1 得到 3D 号码 -->" + lotteryMsg + "我真幸运");

    }

}


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


public class test {
    public static void main(String[] args) {

        Object3D stub = new Object3D();
        // 客户1
        Observer1 observer1 = new Observer1(stub);
        Observer2 observer2 = new Observer2(stub);

        //
        stub.setMsg("2022/9/17 3D号码 是:1167");
        stub.setMsg("2022/9/17 3D号码 是:1169");
    }

}

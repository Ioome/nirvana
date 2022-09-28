
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

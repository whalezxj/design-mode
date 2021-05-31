package demo.Adapter;

/**
 * @author zxj
 * @date 2021/5/31
 **/
public class BikeAdapter implements AdapterTarget{

    private BikeAdaptee adaptee;


    public BikeAdapter(BikeAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void run() {
        adaptee.bikeRun();
    }
}

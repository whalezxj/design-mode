package demo.Adapter;

/**
 * @author zxj
 * @date 2021/5/31
 **/
public class CarAdapter implements AdapterTarget {

    private CarAdaptee adaptee;

    public CarAdapter(CarAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void run() {
        adaptee.carRun();
    }
}

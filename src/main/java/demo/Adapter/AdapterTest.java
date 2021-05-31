package demo.Adapter;

/**
 * @author zxj
 * @date 2021/5/31
 **/
public class AdapterTest {


    public static void main(String[] args) {

        BikeAdaptee bikeAdaptee = new BikeAdaptee();
        BikeAdapter bikeAdapter = new BikeAdapter(bikeAdaptee);
        bikeAdapter.run();
    }


}

package demo.factory;

/**
 * @author zxj
 * @date 2021/5/28
 **/
public class FactoryTest {

    public static void main(String[] args) {
        FactoryInterface fi_1 = new FactoryImpl_1();
        FactoryInterface fi_2 = new FactoryImpl_2();
        fi_1.product();
        fi_2.product();
    }




}

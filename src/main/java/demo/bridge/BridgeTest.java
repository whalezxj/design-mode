package demo.bridge;

/**
 * @author zxj
 * @date 2021/5/31
 **/
public class BridgeTest {

    public static void main(String[] args) {
        BridgeTarget operation1 = new Operation1();
        Abstraction abstraction = new RefinedAbstraction(operation1);
        abstraction.operation();
    }
}

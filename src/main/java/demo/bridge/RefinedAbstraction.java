package demo.bridge;

/**
 * @author zxj
 * @date 2021/5/31
 **/
public class RefinedAbstraction extends Abstraction {


    public RefinedAbstraction(BridgeTarget target) {
        super(target);
    }

    @Override
    public void operation() {
        System.out.println("RefinedAbstraction");
        target.operation();
    }
}

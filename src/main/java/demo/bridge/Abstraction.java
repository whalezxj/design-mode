package demo.bridge;

/**
 * @author zxj
 * @date 2021/5/31
 **/
public abstract class Abstraction {


    protected BridgeTarget target;

    public Abstraction(BridgeTarget target) {
        this.target = target;
    }

    public abstract void  operation();
}

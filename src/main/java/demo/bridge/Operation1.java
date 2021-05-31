package demo.bridge;

/**
 * @author zxj
 * @date 2021/5/31
 **/
public class Operation1 implements BridgeTarget{
    @Override
    public void operation() {
        System.out.println("Operation1```");
    }
}

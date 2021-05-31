package demo.bridge;

/**
 * @author zxj
 * @date 2021/5/31
 **/
public class Operation2 implements BridgeTarget{
    @Override
    public void operation() {
        System.out.println("Operation2```");
    }
}

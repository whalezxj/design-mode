package demo.proxy.static_state;

import demo.proxy.ProxyInterface;

/**
 * @author zxj
 * @date 2021/5/29
 **/
public class InitialImpl implements ProxyInterface {
    @Override
    public void initial() {
        System.out.println("初始对象");
    }
}

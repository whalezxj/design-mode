package demo.proxy.static_state;

import demo.proxy.ProxyInterface;

/**
 * @author zxj
 * @date 2021/5/29
 **/
public class StaticProxyImpl implements ProxyInterface {

    private InitialImpl initial;

    public StaticProxyImpl(InitialImpl initial) {
        this.initial = initial;
    }

    @Override
    public void initial() {
        this.preInitial();
        initial.initial();
        this.afterInitial();
    }

    private void preInitial(){
        System.out.println("代理前");
    }
    private void afterInitial(){
        System.out.println("代理后");
    }
}

package demo.proxy.static_state;

import demo.proxy.ProxyInterface;

/**
 * @author zxj
 * @date 2021/5/29
 **/
public class StaticProxyTest {

    public static void main(String[] args) {
        InitialImpl subject = new InitialImpl();
        ProxyInterface proxy = new StaticProxyImpl(subject);
        proxy.initial();
    }

}

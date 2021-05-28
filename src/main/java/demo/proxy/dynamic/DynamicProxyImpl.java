package demo.proxy.dynamic;

import demo.proxy.ProxyInterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zxj
 * @date 2021/5/29
 **/
public class DynamicProxyImpl implements  ProxyInterface {


    @Override
    public void initial() {
        System.out.println("动态代理");
    }
}

package demo.proxy.dynamic;

import demo.proxy.ProxyInterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author zxj
 * @date 2021/5/29
 **/
public class DynamicProxyTest {

    public static void main(String[] args) {
        ProxyInterface realSubject = new DynamicProxyImpl();
        InvocationImpl invocation = new InvocationImpl(realSubject);
        ProxyInterface proxySubject = (ProxyInterface) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), invocation);
        proxySubject.initial();
    }
}

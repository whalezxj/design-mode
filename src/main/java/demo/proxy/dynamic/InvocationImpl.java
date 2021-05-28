package demo.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zxj
 * @date 2021/5/29
 **/
public class InvocationImpl implements InvocationHandler {

    private Object dynamicProxy;

    public InvocationImpl(Object dynamicProxy) {
        this.dynamicProxy = dynamicProxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理前");
        Object invoke = method.invoke(dynamicProxy, args);
        System.out.println("动态代理后");
        return invoke;
    }
}

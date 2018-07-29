package interview.design.proxy.dynamic;

import interview.design.proxy.BaseMethod;
import interview.design.proxy.MethodA;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class InvokeProxy implements InvocationHandler {
    private Object target;

    public InvokeProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target,args);

    }


    public static void main(String[] args) {
        BaseMethod baseMethod = new MethodA();
        InvocationHandler baseMethodProxy = new InvokeProxy(baseMethod);
        BaseMethod baseMethod1 = (BaseMethod)Proxy.newProxyInstance(baseMethodProxy.getClass().getClassLoader(),baseMethod.getClass().getInterfaces(),baseMethodProxy);
        baseMethod1.A();
    }

}

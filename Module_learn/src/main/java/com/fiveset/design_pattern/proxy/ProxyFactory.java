package com.fiveset.design_pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private TrainStation trainStation = new TrainStation();

    public BuyTickets getProxyObject() {
        BuyTickets proxyObject = (BuyTickets) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                BuyTickets.class.getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("invoke...");
                        Object obj = method.invoke(trainStation,args);
                        return obj;
                    }
                }
        );
        return proxyObject;
    }

}

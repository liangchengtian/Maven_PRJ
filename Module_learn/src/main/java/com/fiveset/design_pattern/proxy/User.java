package com.fiveset.design_pattern.proxy;

public class User {
    public ProxyTickets proxy;
    public void buyTicket() {
        System.out.println("用户正在买票");
        System.out.println("用户委托代理方买票");
        String ticket = proxy.buyTickt();
        System.out.println("用户买到了票：" + ticket);
    }
}

package com.fiveset.design_pattern.proxy;

public class Test {
    public static void main(String[] args) {
        //创建火车站对象
        //TrainStation trainStation = new TrainStation();
        //创建代理点
        //ProxyTickets proxyTk = new ProxyTickets();
        //绑定代理点和火车站
        //proxyTk.setTrainStation(trainStation);

        //创建用户并买票
        //User user = new User();
        //user.proxy = proxyTk;
        //user.buyTicket();


        ProxyFactory factory = new ProxyFactory();
        BuyTickets proxy = factory.getProxyObject();

        proxy.buyTickt();




    }
}

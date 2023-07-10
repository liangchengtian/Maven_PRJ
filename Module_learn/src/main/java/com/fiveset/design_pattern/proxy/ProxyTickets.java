package com.fiveset.design_pattern.proxy;

public class ProxyTickets implements BuyTickets{
    private TrainStation trainStation;

    public void setTrainStation(TrainStation trainStation) {
        this.trainStation = trainStation;
    }

    @Override
    public String buyTickt() {
        System.out.println("代理方正在帮客户买票。。。");
        String ticket = trainStation.sellTicket();
        System.out.println("代理方把票给到用户");
        return ticket;
    }
}

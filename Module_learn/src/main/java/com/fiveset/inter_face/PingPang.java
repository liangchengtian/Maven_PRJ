package com.fiveset.inter_face;

public class PingPang extends Person implements Inter {

    public PingPang(String name, int age){
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println("乒乓球运动员在吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("乒乓球运动员在睡觉");
    }

    @Override
    public void english() {
        System.out.println("pp-english");
    }
}

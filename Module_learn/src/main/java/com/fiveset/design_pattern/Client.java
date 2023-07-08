package com.fiveset.design_pattern;

public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;

        SingletonLacy instance2 = SingletonLacy.Holder.INSTANCE;
        SingletonLacy instance3 = SingletonLacy.Holder.INSTANCE;

        System.out.println(instance2==instance3);
        System.out.println(instance2==instance3);
    }
}

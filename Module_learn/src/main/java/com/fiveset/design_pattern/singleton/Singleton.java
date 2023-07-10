package com.fiveset.design_pattern.singleton;

public class Singleton {
    //私有化构造方法，禁止被外界创建
    private Singleton() {}

    //声明公开的最终的静态变量，供外界使用
    public static final Singleton INSTANCE = new Singleton();
}

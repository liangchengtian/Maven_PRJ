package com.fiveset.design_pattern;

public class SingletonLacy {
    private SingletonLacy() {}
    public static class Holder{
        //测试是否类加载的时候，内部类里面是否被执行了
        static {
            System.out.println("内部类被初始化了");
        }
        public static final SingletonLacy INSTANCE = new SingletonLacy();
    }
}

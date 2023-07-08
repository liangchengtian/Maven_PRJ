package com.fiveset.inter_face;

public abstract class Person {
    private String name;
    private int age;

    public Person(){
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public abstract void eat();
    public abstract void sleep();
}

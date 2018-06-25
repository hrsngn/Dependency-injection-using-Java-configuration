package com.example.plainspring.model;

public class MyBean {
    private String stringOne;
    private String name;

    public MyBean() {
    }

    public MyBean(String name) {
        this.name = name;
    }

    public String getStringOne() {
        return stringOne;
    }

    public void setStringOne(String stringOne) {
        this.stringOne = stringOne;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void doSomething () {
        System.out.println(getName()+ "'s StringOne:  " + getStringOne());
    }
}

package com.example.plainspring.model;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;

public class MyBean {
    private String stringOne;
    private String name;

    @Value("#{2 ^ 9}") // 512
    private double powerOf;

    @PostConstruct
    public void initIt(){
        System.out.println("print from method initIt");
    }

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

    public double getPowerOf() {
        return powerOf;
    }

    public void setPowerOf(double powerOf) {
        this.powerOf = powerOf;
    }

    public void doSomething () {
        System.out.println(getName()+ "'s StringOne:  " + getStringOne());
    }
}

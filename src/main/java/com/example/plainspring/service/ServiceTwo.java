package com.example.plainspring.service;

import com.example.plainspring.repository.RepoTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceTwo {

    @Autowired
    private RepoTwo repoTwo;

    public String findString(){
        return "SERVICE TWO : "+repoTwo.findString();
    }

    public void init(){
        System.out.println("initialization SERVICE TWO");
    }
}

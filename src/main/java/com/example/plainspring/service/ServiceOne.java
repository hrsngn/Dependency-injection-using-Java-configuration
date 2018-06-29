package com.example.plainspring.service;

import com.example.plainspring.repository.RepoOne;

public class ServiceOne {

    private final RepoOne repoOne;

    public ServiceOne(RepoOne repoOne){
        this.repoOne = repoOne;
    }

    public void findTheString(){
        System.out.println("SERVICE ONE : "+this.repoOne.findString());
//        return "SERVICE ONE : "+this.repoOne.findString();
    }
}

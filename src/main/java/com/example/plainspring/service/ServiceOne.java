package com.example.plainspring.service;

import com.example.plainspring.repository.RepoOne;

public class ServiceOne {

    private final RepoOne repoOne;

    public ServiceOne(RepoOne repoOne){
        this.repoOne = repoOne;
    }

    public String findTheString(){
        return "SERVICE ONE : "+this.repoOne.findString();
    }
}

package com.example.plainspring.repository;

import org.springframework.stereotype.Component;

@Component
public class RepoTwo {
    public String findString(){
        return "some-string from RepoTwo";
    }

}

package com.example.plainspring.config;

import com.example.plainspring.repository.RepoOne;
import com.example.plainspring.service.ServiceOne;
import com.example.plainspring.service.ServiceTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfig {
//    @Bean
//    public ServiceTwo serviceTwo(){
//        return new ServiceTwo();
//    };

    @Bean
    public RepoOne repoOne(){
        return new RepoOne();
    }

    @Bean
    public ServiceOne serviceOne(){
        return new ServiceOne(repoOne());
    }
}

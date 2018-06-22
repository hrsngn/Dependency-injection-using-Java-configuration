package com.example.plainspring;

import com.example.plainspring.repository.RepoOne;
import com.example.plainspring.service.ServiceOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfig {
    @Bean
    public RepoOne repoOne(){
        return new RepoOne();
    }

    @Bean
    public ServiceOne serviceOne(){
        return new ServiceOne(repoOne());
    }
}

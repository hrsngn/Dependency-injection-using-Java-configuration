package com.example.plainspring.config;

import com.example.plainspring.BeanFactoryPostProcessorTest;
import com.example.plainspring.aspect.MyBeanAspect;
import com.example.plainspring.repository.RepoOne;
import com.example.plainspring.service.ServiceOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class CustomConfig {

    @Bean
    BeanFactoryPostProcessorTest beanFactoryPostProcessorTest(){
        return new BeanFactoryPostProcessorTest();
    }

    @Bean
    public RepoOne repoOne(){
        return new RepoOne();
    }

    @Bean
    public ServiceOne serviceOne(){
        return new ServiceOne(repoOne());
    }

    @Bean
    public MyBeanAspect beanAspect(){ return new MyBeanAspect();}
}

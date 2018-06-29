package com.example.plainspring.config;

import ch.qos.logback.core.db.DriverManagerConnectionSource;
import com.example.plainspring.BeanFactoryPostProcessorTest;
import com.example.plainspring.aspect.MyBeanAspect;
import com.example.plainspring.repository.RepoOne;
import com.example.plainspring.repository.RepoThree;
import com.example.plainspring.service.ServiceOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

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
    public RepoThree repoThree(){
        return new RepoThree(dataSource());
    }

    @Bean
    public ServiceOne serviceOne(){
        return new ServiceOne(repoOne());
    }

    @Bean
    public MyBeanAspect beanAspect(){ return new MyBeanAspect();}

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.mariadb.jdbc.Driver");
        dataSource.setUrl("jdbc:mariadb://localhost:3306/plainspring");
        dataSource.setUsername("root");
        dataSource.setPassword("Passw0rd");
        return dataSource;
    }
}

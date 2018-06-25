package com.example.plainspring;

import com.example.plainspring.config.CustomConfig;
import com.example.plainspring.service.ServiceOne;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {
		"com.example.plainspring"})
@SpringBootApplication
public class PlainspringApplication {


	public static void main(String[] args) {
//		SpringApplication.run(PlainspringApplication.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CustomConfig.class);
		ServiceOne serviceOne = ctx.getBean(ServiceOne.class);
		System.out.println(serviceOne.findTheString());
	}

	/*
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(PlainspringApplication.class, args);
		System.out.println("Contains repoOne  "+ctx.containsBeanDefinition("repoOne"));
		System.out.println("Contains repoTwo "+ctx.containsBeanDefinition("repoTwo"));
	}
	*/
}

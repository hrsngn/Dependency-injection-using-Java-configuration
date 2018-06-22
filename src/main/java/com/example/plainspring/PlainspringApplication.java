package com.example.plainspring;

import com.example.plainspring.service.ServiceOne;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class PlainspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlainspringApplication.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CustomConfig.class);
		ServiceOne serviceOne = ctx.getBean(ServiceOne.class);
		System.out.println(serviceOne.findTheString());
	}
}

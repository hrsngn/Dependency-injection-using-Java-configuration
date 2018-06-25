package com.example.plainspring;

import com.example.plainspring.config.CustomConfig;
import com.example.plainspring.model.MyBean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {
		"com.example.plainspring"})
@SpringBootApplication
public class PlainspringApplication {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CustomConfig.class);
		MyBean bean= ctx.getBean(MyBean.class);
		bean.setName("Bean One");
		bean.doSomething();
		MyBean bean2= ctx.getBean(MyBean.class);
		bean2.setName("Bean Two");
		bean2.doSomething();
	}
}

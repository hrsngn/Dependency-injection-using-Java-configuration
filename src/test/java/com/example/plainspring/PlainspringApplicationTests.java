package com.example.plainspring;

import com.example.plainspring.config.CustomConfig;
import com.example.plainspring.model.MyBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = CustomConfig.class)
public class PlainspringApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	public void contextLoads() {
		MyBean bean1 = applicationContext.getBean(MyBean.class);
		assertEquals("from postProcessBeanFactory",bean1.getStringOne());
	}

}

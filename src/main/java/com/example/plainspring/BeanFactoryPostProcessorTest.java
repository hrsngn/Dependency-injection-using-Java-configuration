package com.example.plainspring;

import com.example.plainspring.model.MyBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class BeanFactoryPostProcessorTest implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException{
        GenericBeanDefinition bd = new GenericBeanDefinition();
        bd.setBeanClass(MyBean.class);
        bd.getPropertyValues().add("stringOne", "from postProcessBeanFactory");
        ((DefaultListableBeanFactory) beanFactory).registerBeanDefinition("myBeanName", bd);
    }
}

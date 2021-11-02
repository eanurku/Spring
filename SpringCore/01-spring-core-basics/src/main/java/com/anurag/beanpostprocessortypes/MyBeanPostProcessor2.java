package com.anurag.beanpostprocessortypes;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class MyBeanPostProcessor2 implements BeanPostProcessor, Ordered {

    @Override
     public Object postProcessBeforeInitialization(Object bean, String beanName)   {
        System.out.println("MyBeanPostProcessor2 postProcessBeforeInitialization...");
        return bean;
    }

    @Override
     public Object postProcessAfterInitialization(Object bean, String beanName)   {
        System.out.println("MyBeanPostProcessor2 postProcessAfterInitialization...");
        return bean;
    }

    @Override
    public int getOrder() {
        return 50;
    }
}

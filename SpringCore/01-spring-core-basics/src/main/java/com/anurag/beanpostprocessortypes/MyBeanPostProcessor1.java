package com.anurag.beanpostprocessortypes;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class MyBeanPostProcessor1 implements BeanPostProcessor, Ordered {

    @Override
     public Object postProcessBeforeInitialization(Object bean, String beanName)   {
        System.out.println("MyBeanPostProcessor1 postProcessBeforeInitialization...");
        return bean;
    }

    @Override
     public Object postProcessAfterInitialization(Object bean, String beanName)   {
        System.out.println("MyBeanPostProcessor1 postProcessAfterInitialization...");
        return bean;
    }

    @Override
    public int getOrder() {
        return 100;
    }
}

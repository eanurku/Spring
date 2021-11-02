package com.anurag.beanpostprocessor;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
     public Object postProcessBeforeInitialization(Object bean, String beanName)   {
        System.out.println("MyBeanPostProcessor postProcessBeforeInitialization..."+bean);
        return bean;
    }

    @Override
     public Object postProcessAfterInitialization(Object bean, String beanName)   {
        System.out.println("MyBeanPostProcessor postProcessAfterInitialization..."+bean);
        return bean;
    }
}

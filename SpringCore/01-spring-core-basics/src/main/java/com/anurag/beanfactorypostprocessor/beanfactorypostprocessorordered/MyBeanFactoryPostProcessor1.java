package com.anurag.beanfactorypostprocessor.beanfactorypostprocessorordered;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

public class MyBeanFactoryPostProcessor1 implements BeanFactoryPostProcessor, Ordered {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("MyBeanFactoryPostProcessor1 postProcessBeanFactory called...." );
    }

    @Override
    public int getOrder() {
        return 100;
    }
}

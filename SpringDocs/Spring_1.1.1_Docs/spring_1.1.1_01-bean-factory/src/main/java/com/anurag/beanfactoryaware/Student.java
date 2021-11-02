package com.anurag.beanfactoryaware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

public class Student implements BeanFactoryAware, BeanNameAware {

    String      name;
    int         id;
    BeanFactory factory;
    String      beanNameValue;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.factory = beanFactory;
    }

    @Override
    public void setBeanName(String s) {
        this.beanNameValue = s;
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BeanFactory getFactory() {
        return factory;
    }

    public String getBeanNameValue() {
        return beanNameValue;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", factory=" + factory +
                ", beanNameValue='" + beanNameValue + '\'' +
                '}';
    }
}

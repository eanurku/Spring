package com.anurag.beanlifecycle.initializableanddisposable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean {

    int id;
    String sname;

    public Student(int id, String sname) {
        this.id = id;
        this.sname = sname;

    }

    public int getId() {
        return id;
    }

    public String getSname() {
        return sname;
    }

    public void initialize(){
        System.out.println("initializing method....");
    }
    public void clean(){
        System.out.println("clean method....");
    }

    @Override
    public void destroy() throws Exception {

        System.out.println("destroy() is called...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet() is called...");
    }
}

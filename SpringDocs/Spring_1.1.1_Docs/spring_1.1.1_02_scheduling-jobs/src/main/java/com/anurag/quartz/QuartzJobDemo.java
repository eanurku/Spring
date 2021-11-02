package com.anurag.quartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//using springboot just for showing job runs


@SpringBootApplication
@ImportResource("classpath:QuartzJob.xml")
public class QuartzJobDemo {

    public static void main(String[] args) {
        SpringApplication.run(QuartzJobDemo.class);
        //        System.out.println("hello");
        //
        //        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("QuartzJob.xml"));
        //        Student student = factory.getBean("student", Student.class);
        //        System.out.println(student);

    }

}

package com.anurag;


import com.anurag.models.Customer;
import com.anurag.models.Employee;
import com.anurag.services.CommonService;
import com.anurag.services.CustomerService;
import com.anurag.services.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App {

    public static void main(String[] args) {
        System.out.println("app started");

        ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");




        CommonService commonServices = context.getBean("commonService", CommonService.class);

        System.out.println("--------------------");
        List<Employee> emps = commonServices.findAllEmployees();
        System.out.println(emps);

        System.out.println("--------------------");
        List<Customer> custs = commonServices.findAllCustomers();
        System.out.println(custs);

        System.out.println("--------------------");
        System.out.println(commonServices);




    }
}

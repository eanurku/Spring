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

        CustomerService customerService = context.getBean("customerService", CustomerService.class);
        List<Customer> customers = customerService.findAll();
        System.out.println(customers);

        System.out.println("--------------------");

        EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
        List<Employee> employees = employeeService.findAll();
        System.out.println(employees);

        System.out.println("--------------------");

        CommonService commonServices = context.getBean("commonService", CommonService.class);
        List<Employee> emps = commonServices.findAllEmployees();
        System.out.println(emps);

        List<Customer> custs = commonServices.findAllCustomers();
        System.out.println(custs);



    }
}

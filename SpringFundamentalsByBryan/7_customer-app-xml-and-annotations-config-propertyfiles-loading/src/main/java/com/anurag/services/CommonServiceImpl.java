package com.anurag.services;

import com.anurag.models.Customer;
import com.anurag.models.Employee;
import com.anurag.repository.CustomerRepository;
import com.anurag.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class CommonServiceImpl implements CommonService {

    private EmployeeRepository employeeRepository;
    private CustomerRepository customerRepository;

    @Value("${user}")
    private String user;
    @Value("${password}")
    private String password;


    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public String toString() {
        return "CommonServiceImpl{" +
                "employeeRepository=" + employeeRepository +
                ", customerRepository=" + customerRepository +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

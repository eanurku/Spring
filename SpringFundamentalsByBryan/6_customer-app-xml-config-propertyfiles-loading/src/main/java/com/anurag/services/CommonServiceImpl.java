package com.anurag.services;

import com.anurag.models.Customer;
import com.anurag.models.Employee;
import com.anurag.repository.CustomerRepository;
import com.anurag.repository.EmployeeRepository;

import java.util.List;

public class CommonServiceImpl implements CommonService {

    private EmployeeRepository employeeRepository;
    private CustomerRepository customerRepository;

    private String user;
    private String password;

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
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

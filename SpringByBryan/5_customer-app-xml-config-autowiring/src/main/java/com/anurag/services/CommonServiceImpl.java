package com.anurag.services;

import com.anurag.models.Customer;
import com.anurag.models.Employee;
import com.anurag.repository.CustomerRepository;
import com.anurag.repository.EmployeeRepository;

import java.util.List;

public class CommonServiceImpl implements CommonService {

    private EmployeeRepository employeeRepository;
    private CustomerRepository customerRepository;

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
}

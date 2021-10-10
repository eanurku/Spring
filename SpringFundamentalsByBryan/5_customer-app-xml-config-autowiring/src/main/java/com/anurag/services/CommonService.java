package com.anurag.services;

import com.anurag.models.Customer;
import com.anurag.models.Employee;

import java.util.List;

public interface CommonService {

    List<Customer> findAllCustomers();

    List<Employee> findAllEmployees();
}

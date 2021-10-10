package com.anurag.repository;

import com.anurag.models.Employee;

import java.util.List;

public interface EmployeeRepository {

    List<Employee> findAll();
}

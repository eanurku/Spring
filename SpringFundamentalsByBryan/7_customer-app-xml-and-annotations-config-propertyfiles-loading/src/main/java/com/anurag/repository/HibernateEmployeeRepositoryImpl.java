package com.anurag.repository;

import com.anurag.models.Employee;

import java.util.ArrayList;
import java.util.List;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {

    public HibernateEmployeeRepositoryImpl() {
    }

    @Override
    public List<Employee> findAll(){

        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee("Monu K","123"));
        return employees;
    }
}

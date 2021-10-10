package com.anurag.repository;

import com.anurag.models.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository("employeeRepository")
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

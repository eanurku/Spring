package com.anurag.repository;

import com.anurag.models.Customer;

import java.util.List;

public interface CustomerRepository {

    List<Customer> findAll();
}

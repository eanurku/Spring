package com.anurag.repository;

import com.anurag.models.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {


    @Override
    public List<Customer> findAll(){

        Customer customer=new Customer();
        customer.setFirstname("anurag");
        customer.setSecondname("kumar");

        List<Customer> customers=new ArrayList<>();
        customers.add(customer);

        return customers;

    }
}

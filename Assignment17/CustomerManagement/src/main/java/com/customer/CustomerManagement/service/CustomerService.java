package com.customer.CustomerManagement.service;

import com.customer.CustomerManagement.entity.Customer;

import java.util.List;

public interface CustomerService {

    Customer create(Customer customer);

    Customer getCustomerById(Long id);

    List<Customer> getAllCustomers();

    Customer update(Long id, Customer updatedCustomer);

    String delete(Long id);
}

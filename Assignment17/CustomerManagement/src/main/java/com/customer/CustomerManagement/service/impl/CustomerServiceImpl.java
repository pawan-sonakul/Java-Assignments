package com.customer.CustomerManagement.service.impl;

import com.customer.CustomerManagement.entity.Customer;
import com.customer.CustomerManagement.exception.CustomerNotFoundException;
import com.customer.CustomerManagement.repository.CustomerRepository;
import com.customer.CustomerManagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElseThrow(() -> {
            throw new CustomerNotFoundException("Customer not found with id " + id);
        });
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer update(Long id, Customer updatedCustomer) {
        Customer existingCustomer = getCustomerById(id);
        existingCustomer.setName(updatedCustomer.getName());
        existingCustomer.setEmail(updatedCustomer.getEmail());
        existingCustomer.setPhone(updatedCustomer.getPhone());
        return customerRepository.save(existingCustomer);
    }


    @Override
    public String delete(Long id) {
        getCustomerById(id);
        customerRepository.deleteById(id);
        return "Customer Deleted Successfully";
    }
}

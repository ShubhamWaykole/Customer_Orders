package com.workspace.customerorders.service;

import com.workspace.customerorders.entities.Customer;
import com.workspace.customerorders.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    Logger log = (Logger) LoggerFactory.getLogger(CustomerService.class);

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> createCustomers(List<Customer> list)
    {
        return customerRepository.saveAll(list);
    }

    public Customer getCustomer(String name)
    {
        return customerRepository.findByName(name);
    }

}

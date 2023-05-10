package com.workspace.customerorders.rest;

import com.workspace.customerorders.entities.Customer;
import com.workspace.customerorders.service.CustomerService;
import jakarta.websocket.server.PathParam;
import org.apache.coyote.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
    Logger log = (Logger) LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private CustomerService customerService;

    @PostMapping
    @ResponseBody
    public List<Customer> create(@RequestBody List<Customer> customersList)
    {
        return customerService.createCustomers(customersList);
    }

    @GetMapping(value = "/{name}")
    @ResponseBody
    public Customer getCustomer(@PathVariable("name") String name)
    {
        return customerService.getCustomer(name);
    }
}

package com.workspace.customerorders;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@OpenAPIDefinition
public class CustomerOrdersApplication  extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(CustomerOrdersApplication.class, args);
    }

}

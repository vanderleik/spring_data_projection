package com.spring.data.projection.api.controllers;

import com.spring.data.projection.api.domain.dtos.CustomerDTO;
import com.spring.data.projection.api.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CustomerDTO> getCustomers() throws Exception {
        return customerService.getCustomerAndOrderData();
    }

}

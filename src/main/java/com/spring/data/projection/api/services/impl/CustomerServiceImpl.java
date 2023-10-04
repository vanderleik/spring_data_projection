package com.spring.data.projection.api.services.impl;

import com.spring.data.projection.api.domain.dtos.CustomerDTO;
import com.spring.data.projection.api.repositories.CustomerRepository;
import com.spring.data.projection.api.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<CustomerDTO> getCustomerAndOrderData() {
        return customerRepository.getCustomerDetails();
    }

}

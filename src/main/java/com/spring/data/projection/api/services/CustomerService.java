package com.spring.data.projection.api.services;

import com.spring.data.projection.api.domain.dtos.CustomerDTO;

import java.util.List;

public interface CustomerService {
    List<CustomerDTO> getCustomerAndOrderData();
}

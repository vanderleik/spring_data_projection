package com.spring.data.projection.api.domain.dtos;

import org.springframework.beans.factory.annotation.Value;

public interface CustomerDTO {
    Integer getCustomerId();

    @Value("#{target.firstName + ' ' + target.lastName}")
    String getCustomerName();

    String getCity();

    String getCountry();

    @Value("#{@mapperUtility.buildOrderDTO(target.orderNumber, target.totalAmount)}")
    OrderDTO getOrder();
}

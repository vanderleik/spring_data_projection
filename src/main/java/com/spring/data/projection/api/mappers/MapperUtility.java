package com.spring.data.projection.api.mappers;

import com.spring.data.projection.api.domain.dtos.OrderDTO;
import org.springframework.stereotype.Component;

@Component
public class MapperUtility {
    public OrderDTO buildOrderDTO(Long orderNumber, Double totalAmount) {
        OrderDTO order = null;

        if (orderNumber != null) {
            order = new OrderDTO();
            order.setOrderNumber(orderNumber);
            order.setTotalAmount("$ " + totalAmount);
        }
        return order;
    }
}

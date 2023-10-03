package com.spring.data.projection.api.domain.dtos;

import com.spring.data.projection.api.domain.entities.OrderEntity;

public record CustomerDTO(Integer id, String firstName, String lastName, String city, String country, OrderEntity order) {
}

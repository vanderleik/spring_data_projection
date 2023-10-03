package com.spring.data.projection.api.repositories;

import com.spring.data.projection.api.domain.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
}

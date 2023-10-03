package com.spring.data.projection.api.repositories;

import com.spring.data.projection.api.domain.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {
}

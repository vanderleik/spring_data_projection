package com.spring.data.projection.api.repositories;

import com.spring.data.projection.api.domain.dtos.CustomerDTO;
import com.spring.data.projection.api.domain.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {

@Query(name = "customerEntity.getCustomerDetails", nativeQuery = true)
    List<CustomerDTO> getCustomerDetails();
}

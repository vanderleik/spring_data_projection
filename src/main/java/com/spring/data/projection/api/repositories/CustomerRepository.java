package com.spring.data.projection.api.repositories;

import com.spring.data.projection.api.domain.dtos.CustomerDTO;
import com.spring.data.projection.api.domain.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {

    @Query(name = "customerEntity.getCustomerDetails", nativeQuery = true)
    List<CustomerDTO> getCustomerDetails();

    @Query(name = "customerEntity.searchCustomerByFirstName", nativeQuery = true)
    List<CustomerDTO> searchCustomerByFirstName(@Param("firstName") String firstName);
}

package com.spring.data.projection.api.mappers;

import com.spring.data.projection.api.domain.dtos.CustomerDTO;
import com.spring.data.projection.api.domain.entities.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class CustomerMapper {

    public static final CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);
    public abstract CustomerEntity toEntity(CustomerDTO customerDTO);
}

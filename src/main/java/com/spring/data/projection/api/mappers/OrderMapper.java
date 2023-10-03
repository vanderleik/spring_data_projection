package com.spring.data.projection.api.mappers;

import com.spring.data.projection.api.domain.dtos.OrderDTO;
import com.spring.data.projection.api.domain.entities.OrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class OrderMapper {

    public static final OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
    public abstract OrderEntity toEntity(OrderDTO orderDTO);
}

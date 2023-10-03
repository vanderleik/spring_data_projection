package com.spring.data.projection.api.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CUSTOMER_ORDER")
public class OrderEntity {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "ORDER_NUMBER")
    private Long orderNumber;

    @Column(name = "TOTAL_AMOUNT")
    private String totalAmount;

    @OneToOne
    @JoinColumn(name="CUSTOMER_ID", nullable=false)
    private CustomerEntity customer;
}

package com.practice.spring.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CartVenPrice {
    private Integer venId;
    private BigDecimal itemPrice;
}

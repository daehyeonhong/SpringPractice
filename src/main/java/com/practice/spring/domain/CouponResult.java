package com.practice.spring.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CouponResult {
    private Integer venId;
    private BigDecimal itemPrice;
}

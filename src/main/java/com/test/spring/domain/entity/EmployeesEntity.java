package com.test.spring.domain.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmployeesEntity {

    private Integer employeeId;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    private Date hireDate;

    private String jobId;

    private BigDecimal salary;

    private BigDecimal commissionPct;

    private Integer managerId;

    private Short departmentId;

}
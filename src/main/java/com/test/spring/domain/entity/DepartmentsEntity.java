package com.test.spring.domain.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DepartmentsEntity {

    private Short departmentId;

    private String departmentName;

    private Integer managerId;

    private Short locationId;

}
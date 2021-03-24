package com.practice.spring.domain.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class JobsEntity {

    private String jobId;

    private String jobTitle;

    private Integer minSalary;

    private Integer maxSalary;

}
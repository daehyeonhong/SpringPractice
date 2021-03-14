package com.test.spring.domain.entity;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class JobHistoryEntity {

    private Integer employeeId;

    private Date startDate;

    private Date endDate;

    private String jobId;

    private Short departmentId;

}
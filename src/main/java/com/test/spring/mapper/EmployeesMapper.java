package com.test.spring.mapper;

import java.util.List;
import com.test.spring.domain.entity.EmployeesEntity;

public interface EmployeesMapper {

    int deleteByPrimaryKey(Integer employeeId);

    int insert(EmployeesEntity record);

    EmployeesEntity selectByPrimaryKey(Integer employeeId);

    List<EmployeesEntity> selectAll();

    int updateByPrimaryKey(EmployeesEntity record);

}
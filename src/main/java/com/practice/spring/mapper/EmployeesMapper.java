package com.practice.spring.mapper;

import java.util.List;

import com.practice.spring.domain.entity.EmployeesEntity;

public interface EmployeesMapper {

    int deleteByPrimaryKey(Integer employeeId);

    int insert(EmployeesEntity record);

    EmployeesEntity selectByPrimaryKey(Integer employeeId);

    List<EmployeesEntity> selectAll();

    int updateByPrimaryKey(EmployeesEntity record);

}
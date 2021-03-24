package com.practice.spring.mapper;

import java.util.List;

import com.practice.spring.domain.entity.DepartmentsEntity;

public interface DepartmentsMapper {

    int deleteByPrimaryKey(Short departmentId);

    int insert(DepartmentsEntity record);

    DepartmentsEntity selectByPrimaryKey(Short departmentId);

    List<DepartmentsEntity> selectAll();

    int updateByPrimaryKey(DepartmentsEntity record);

}
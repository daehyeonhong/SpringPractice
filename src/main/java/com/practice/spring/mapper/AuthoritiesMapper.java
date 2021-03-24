package com.practice.spring.mapper;

import java.util.List;

import com.practice.spring.domain.entity.AuthoritiesEntity;

public interface AuthoritiesMapper {

    int insert(AuthoritiesEntity record);

    List<AuthoritiesEntity> selectAll();

}
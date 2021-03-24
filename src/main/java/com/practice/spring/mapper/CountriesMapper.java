package com.practice.spring.mapper;

import java.util.List;

import com.practice.spring.domain.entity.CountriesEntity;

public interface CountriesMapper {

    int deleteByPrimaryKey(String countryId);

    int insert(CountriesEntity record);

    CountriesEntity selectByPrimaryKey(String countryId);

    List<CountriesEntity> selectAll();

    int updateByPrimaryKey(CountriesEntity record);

}
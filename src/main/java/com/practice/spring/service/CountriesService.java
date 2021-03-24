package com.practice.spring.service;

import java.util.List;

import com.practice.spring.domain.entity.CountriesEntity;

public interface CountriesService {

    public CountriesEntity selectByPrimaryKey(String countryId);

    public List<CountriesEntity> selectAll();

    public Integer insert(CountriesEntity countriesEntity);

    public Integer updateByPrimaryKey(CountriesEntity countriesEntity);

}
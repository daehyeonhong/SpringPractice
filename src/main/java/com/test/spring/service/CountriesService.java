package com.test.spring.service;

import com.test.spring.domain.entity.CountriesEntity;

public interface CountriesService {

    public CountriesEntity selectByPrimaryKey(String countryId);

}
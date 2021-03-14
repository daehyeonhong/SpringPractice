package com.test.spring.service;

import org.springframework.stereotype.Service;
import com.test.spring.domain.entity.CountriesEntity;
import com.test.spring.mapper.CountriesMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CountriesServiceImpl implements CountriesService {

    private CountriesMapper countriesMapper;

    @Override
    public CountriesEntity selectByPrimaryKey(String countryId) {
        return countriesMapper.selectByPrimaryKey(countryId);
    }

}
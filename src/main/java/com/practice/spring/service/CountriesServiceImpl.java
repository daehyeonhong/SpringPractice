package com.practice.spring.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.practice.spring.domain.entity.CountriesEntity;
import com.practice.spring.mapper.CountriesMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CountriesServiceImpl implements CountriesService {

    private CountriesMapper countriesMapper;

    @Override
    public CountriesEntity selectByPrimaryKey(String countryId) {
        return countriesMapper.selectByPrimaryKey(countryId);
    }

    @Override
    public List<CountriesEntity> selectAll() {
        return countriesMapper.selectAll();
    }

    @Override
    public Integer insert(CountriesEntity countriesEntity) {
        return countriesMapper.insert(countriesEntity);
    }

    @Override
    public Integer updateByPrimaryKey(CountriesEntity countriesEntity) {
        return countriesMapper.updateByPrimaryKey(countriesEntity);
    }

}
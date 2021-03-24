package com.practice.spring.domain;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.practice.spring.domain.entity.CountriesEntity;
import com.practice.spring.service.CountriesService;
import com.practice.spring.config.JUnitTestConfig;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MybatisTests extends JUnitTestConfig {

    @Autowired
    private CountriesService countriesService;

    @Test
    public void testFactory() {
        CountriesEntity countriesEntity = countriesService.selectByPrimaryKey("DK");
        log.info(countriesEntity.toString());
    }

}
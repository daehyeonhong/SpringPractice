package com.test.spring.domain;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.test.spring.config.JUnitTestConfig;
import com.test.spring.domain.entity.CountriesEntity;
import com.test.spring.service.CountriesService;
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
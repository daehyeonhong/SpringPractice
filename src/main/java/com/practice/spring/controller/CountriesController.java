package com.practice.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.practice.spring.mapper.CountriesMapper;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/countries")
public class CountriesController {

    @Setter(onMethod_ = @Autowired)
    private CountriesMapper countriesMapper;

    @RequestMapping(value = "/")
    public void countries() {
        log.info("countries");
        countriesMapper.selectAll().forEach(country -> log.info("{}", country));
    }

}
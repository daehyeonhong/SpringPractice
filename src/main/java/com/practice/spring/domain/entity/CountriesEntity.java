package com.practice.spring.domain.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CountriesEntity {

    private String countryId;

    private String countryName;

    private Short regionId;

}
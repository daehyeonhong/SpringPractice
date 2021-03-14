package com.test.spring.domain.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LocationsEntity {

    private Short locationId;

    private String streetAddress;

    private String postalCode;

    private String city;

    private String stateProvince;

    private String countryId;

}
package com.practice.spring.javaPractice;

import java.time.LocalDate;
import java.time.LocalTime;
import org.junit.Test;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeTests {

    @Test
    public void dateValidateTest() {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalTime validateTime = LocalTime.of(23, 30);
        log.info("{}, {}, {}, {}", localDate, localTime, validateTime, localTime.isAfter(validateTime));
    }

}
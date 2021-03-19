package com.practice.spring.javaPractice;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
import com.practice.spring.config.JUnitTestConfig;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeTests extends JUnitTestConfig {

    @Test
    public void dateValidateTest() {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        log.info("{}, {}", localDate, localTime);
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        String date = dateFormat.format(calendar.getTime());
        SimpleDateFormat timeFormat = new SimpleDateFormat("HHmm");
        String time = timeFormat.format(calendar.getTime());
        log.info("{}, {}", date, time);
        Date dateObj = new Date();
    }

}
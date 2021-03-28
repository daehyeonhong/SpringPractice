package com.practice.spring.javaPractice;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeTests {

    @Test
    public void dateValidateTest() {
        Map<String, Object> timeMap = new HashMap<String, Object>();

        LocalDate currDate = LocalDate.now();
        LocalTime currTime = LocalTime.now();
        LocalTime baseTime = LocalTime.of(23, 30);
        Long currDateNumber = Long.valueOf(currDate.format(DateTimeFormatter.BASIC_ISO_DATE));
        log.info("{}", currDate.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
        boolean delvAble = currTime.isBefore(baseTime);
        timeMap.put("currDate", currDate);
        timeMap.put("delvAble", delvAble);
        timeMap.put("currDateNumber", currDateNumber);
        log.info("{}", timeMap);
        log.info("seoul : {}, hongkong : {}", LocalTime.now(ZoneId.of("Asia/Seoul")),
                LocalTime.now(ZoneId.of("Asia/Hong_Kong")));
    }

}
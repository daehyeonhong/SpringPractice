package com.test.spring.config;

import org.junit.Test;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogTests {

    @Test
    public void logTest() {
        log.info("[INFO]");
        log.debug("[DEBUG]");
        log.warn("[WARN]");
        log.error("[ERROR]");
    }

}
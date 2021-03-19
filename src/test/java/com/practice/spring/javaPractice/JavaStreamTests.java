package com.practice.spring.javaPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.practice.spring.domain.entity.CountriesEntity;
import com.practice.spring.service.CountriesService;
import com.practice.spring.config.JUnitTestConfig;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JavaStreamTests extends JUnitTestConfig {

    @Autowired
    private CountriesService countriesService;

    @Before
    public void preTest() {
        log.info("================================");
        log.info("Test Start");
        log.info("================================");
    }

    @Test
    @Ignore
    public void defaultTest() {
        log.info("Hello, World!");
    }

    @Test
    @Ignore
    public void stream() {
        String[] arr = new String[] { "a", "b", "c" };
        Stream<String> arrayStream = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
        arrayStream.forEach(streamItem -> log.info("Stream : {}", streamItem));
        streamOfArrayPart.forEach(streamItem -> log.info("streamOfArrayPart : {}", streamItem));
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> listStream = list.stream();
        listStream.forEach(streamItem -> log.info("listStream : {}", streamItem));
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(streamItem -> log.info("parallelStream : {}", streamItem));
        Stream<String> builderStream = Stream.<String>builder().add("Eric").add("Elena").add("Java").build();
        builderStream.forEach(streamItem -> log.info("builderStream : {}", streamItem));
        Stream<String> generateStream = Stream.generate(() -> "gen").limit(5);
        generateStream.forEach(streamItem -> log.info("generateStream : {}", streamItem));
        Stream<Integer> iteratedStream = Stream.iterate(30, index -> index + 2).limit(5);
        iteratedStream.forEach(streamItem -> log.info("iteratedStream : {}", streamItem));
        String url = "https://futurecreator.github.io/2018/08/26/java-8-streams/";
        log.info(url);
        List<CountriesEntity> countries = countriesService.selectAll();
        Stream<CountriesEntity> countriesStream = countries.stream();
        countriesStream.forEach(streamItem -> log.info("countriesStream : {}", streamItem));
    }

    @Test
    public void streamUpdate() {
        List<CountriesEntity> countries = countriesService.selectAll();
        Stream<CountriesEntity> countriesStream = countries.stream();
        countriesStream.forEach(countriesItem -> {
            if (countriesItem.getCountryId() == "DE") {
                countriesItem.setCountryName("바보");
                countriesService.updateByPrimaryKey(countriesItem);
            }
            log.info("{}", countriesItem);
        });
    }

    @Test
    public void insert() {
        CountriesEntity afterCountries = countriesService.selectByPrimaryKey("DE");
        log.info("{}", afterCountries);
    }

    @After
    public void endTest() {
        log.info("================================");
        log.info("Test End");
        log.info("================================");
    }

}
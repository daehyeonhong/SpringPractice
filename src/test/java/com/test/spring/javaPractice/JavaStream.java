package com.test.spring.javaPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JavaStream {
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
    public void stream() {
        String[] arr = new String[] { "a", "b", "c" };
        Stream<String> arrayStream = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
        arrayStream.forEach(streamItem -> log.info("Stream : {}", streamItem));
        streamOfArrayPart.forEach(streamItem -> log.info("streamOfArrayPart : {}", streamItem));
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> listStream = list.stream();
        Stream<String> parallelStream = list.parallelStream();
        listStream.forEach(streamItem -> log.info("Stream : {}", streamItem));
        parallelStream.forEach(streamItem -> log.info("parallelStream : {}", streamItem));
        Stream<String> builderStream = Stream.<String>builder().add("Eric").add("Elena").add("Java").build();
        builderStream.forEach(streamItem -> log.info("builderStream : {}", streamItem));
        Stream<String> generateStream = Stream.generate(() -> "gen").limit(5);
        generateStream.forEach(streamItem -> log.info("generateStream : {}", streamItem));
        Stream<Integer> iteratedStream = Stream.iterate(30, index -> index + 2).limit(5);
        iteratedStream.forEach(streamItem -> log.info("iteratedStream : {}", streamItem));
        String url = "https://futurecreator.github.io/2018/08/26/java-8-streams/";
        log.info(url);
    }

    @After
    public void endTest() {
        log.info("================================");
        log.info("Test End");
        log.info("================================");
    }

}
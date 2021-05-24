package com.practice.spring.javaPractice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.practice.spring.domain.CouponResult;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import com.practice.spring.config.JUnitTestConfig;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JavaStreamTests extends JUnitTestConfig {
    List<CouponResult> couponList = new ArrayList<CouponResult>();


    @Before
    public void preTest() {
        log.info("================================");
        log.info("Test Start");
        log.info("================================");
        CouponResult coupon1 = new CouponResult();
        coupon1.setItemPrice(new BigDecimal(4000));
        coupon1.setVenId(10);
        CouponResult coupon2 = new CouponResult();
        coupon2.setItemPrice(new BigDecimal(4000));
        coupon2.setVenId(9);
        CouponResult coupon3 = new CouponResult();
        coupon3.setItemPrice(new BigDecimal(4000));
        coupon3.setVenId(11);
        CouponResult coupon4 = new CouponResult();
        coupon4.setItemPrice(new BigDecimal(4000));
        coupon4.setVenId(10);
        CouponResult coupon5 = new CouponResult();
        coupon5.setItemPrice(new BigDecimal(4000));
        coupon5.setVenId(11);
        CouponResult coupon6 = new CouponResult();
        coupon6.setItemPrice(new BigDecimal(4000));
        coupon6.setVenId(9);
        couponList.add(coupon1);
        couponList.add(coupon2);
        couponList.add(coupon3);
        couponList.add(coupon4);
        couponList.add(coupon5);
        couponList.add(coupon6);
        couponList.add(coupon1);
        couponList.add(coupon2);
        couponList.add(coupon3);
        couponList.add(coupon4);
        couponList.add(coupon5);
        couponList.add(coupon6);
        couponList.add(coupon1);
        couponList.add(coupon2);
        couponList.add(coupon3);
        couponList.add(coupon4);
        couponList.add(coupon5);
        couponList.add(coupon6);
    }

    @Test
    public void name() {
        List<CouponResult> newCouponList = new ArrayList<CouponResult>();
        couponList.stream().collect(Collectors.groupingBy(CouponResult::getVenId)).forEach(
                (integer, couponResults) -> {
                    CouponResult dummy = new CouponResult();
                    dummy.setVenId(integer);
                    dummy.setItemPrice(BigDecimal.ZERO);
                    newCouponList.add(dummy);
                }
        );
        couponList.stream().collect(Collectors.groupingBy(CouponResult::getVenId)).forEach(
                (integer, couponResults) -> {
                    log.info("{}, {}", integer, couponResults);
                }
        );
    }

    @Test
    @Ignore
    public void defaultTest() {
        log.info("Hello, World!");
    }

    @Test
    @Ignore
    public void stream() {
        String[] arr = new String[]{"a", "b", "c"};
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
    }

    @After
    public void endTest() {
        log.info("================================");
        log.info("Test End");
        log.info("================================");
    }

}
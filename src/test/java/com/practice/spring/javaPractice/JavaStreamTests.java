package com.practice.spring.javaPractice;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.practice.spring.domain.CartVenPrice;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import com.practice.spring.config.JUnitTestConfig;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JavaStreamTests extends JUnitTestConfig {
    List<CartVenPrice> cartVenPriceList = new ArrayList<CartVenPrice>();


    @Before
    public void preTest() {
        CartVenPrice coupon1 = new CartVenPrice();
        coupon1.setItemPrice(new BigDecimal(4000));
        coupon1.setVenId(9);
        CartVenPrice coupon2 = new CartVenPrice();
        coupon2.setItemPrice(new BigDecimal(4000));
        coupon2.setVenId(10);
        CartVenPrice coupon3 = new CartVenPrice();
        coupon3.setItemPrice(new BigDecimal(0));
        coupon3.setVenId(11);
        cartVenPriceList.add(coupon1);
        cartVenPriceList.add(coupon1);
        cartVenPriceList.add(coupon1);
        cartVenPriceList.add(coupon2);
        cartVenPriceList.add(coupon3);
    }

    @Test
    public void listCoupon() {

        List<CartVenPrice> newCartVenPriceList = new ArrayList<CartVenPrice>();
        cartVenPriceList.stream()
                .collect(Collectors.toMap(CartVenPrice::getVenId, CartVenPrice::getItemPrice, BigDecimal::add, HashMap::new))
                .forEach(($venId, $itemPrice) -> {
                            final CartVenPrice $cartVenPrice = new CartVenPrice();
                            $cartVenPrice.setVenId($venId);
                            $cartVenPrice.setItemPrice($itemPrice);
                            newCartVenPriceList.add($cartVenPrice);
                        }
                );
        log.info("{}", newCartVenPriceList);

//        cartVenPriceList.stream().collect(Collectors.toMap(CartVenPrice::getVenId, CartVenPrice::getItemPrice)).forEach(
//                (integer, couponResults) -> {
//                    CartVenPrice dummy = new CartVenPrice();
//                    dummy.setVenId(integer);
//                    dummy.setItemPrice(BigDecimal.ZERO);
//                    newCartVenPriceList.add(dummy);
//                }
//        );

//        cartVenPriceList.stream().collect(Collectors.groupingBy(CartVenPrice::getVenId)).forEach(
//                (integer, couponResults) -> {
//                    CartVenPrice dummy = new CartVenPrice();
//                    dummy.setVenId(integer);
//                    dummy.setItemPrice(BigDecimal.ZERO);
//                    newCartVenPriceList.add(dummy);
//                }
//        );
//        cartVenPriceList.stream().forEach(cartVenPrice -> {
//            newCartVenPriceList.forEach(
//                    newCartVenPrice -> {
//                        if (newCartVenPrice.getVenId().equals(cartVenPrice.getVenId())) {
//                            newCartVenPrice.setItemPrice(newCartVenPrice.getItemPrice().add(cartVenPrice.getItemPrice()));
//                        }
//                    }
//            );
//        });
//
//        log.info("{}", cartVenPriceList);
//        log.info("{}", newCartVenPriceList);
    }

    @Test
    @Ignore
    public void asdfasdfasdf() {
        /*log.info("cartVenPriceList : {}", cartVenPriceList);*/
        List<CartVenPrice> newCartVenPriceList = new ArrayList<CartVenPrice>();
        Map<Integer, BigDecimal> newCouponMap = new HashMap<>();
//        final HashMap<CartVenPrice, Optional<CartVenPrice>> collect = cartVenPriceList.stream().collect(Collectors.groupingBy(cartVenPrice -> cartVenPrice, HashMap::new, Collectors.reducing()));
//        log.info("result : {}", collect);
        log.info("newCouponMap : {}", newCouponMap);

    }

    @Test
    @Ignore
    public void name() {
        log.info("{}", cartVenPriceList);
        List<CartVenPrice> newCartVenPriceList = new ArrayList<CartVenPrice>();
        cartVenPriceList.stream().collect(Collectors.groupingBy(CartVenPrice::getVenId)).forEach(
                (integer, couponResults) -> {
                    CartVenPrice dummy = new CartVenPrice();
                    dummy.setVenId(integer);
                    dummy.setItemPrice(BigDecimal.ZERO);
                    newCartVenPriceList.add(dummy);
                }
        );
        final Map<Integer, BigDecimal> newCouponMap = newCartVenPriceList.stream().collect(Collectors.toMap(CartVenPrice::getVenId, CartVenPrice::getItemPrice));
        log.info("newCouponMap{}", newCouponMap);
        for (CartVenPrice result : cartVenPriceList) {
            final BigDecimal bigDecimal = newCouponMap.get(result.getVenId());
            newCouponMap.put(result.getVenId(), bigDecimal.add(result.getItemPrice()));
        }

        log.info("newCartVenPriceList{}", newCartVenPriceList);
        log.info("newCouponMap{}", newCouponMap);

        List<CartVenPrice> collect = cartVenPriceList.stream().map(cartVenPrice -> {
            cartVenPrice.setItemPrice(BigDecimal.ZERO);
            return cartVenPrice;
        }).distinct().collect(Collectors.toList());
        /*Map<Integer, BigDecimal> newCouponMap = cartVenPriceList.stream().map(couponResult -> {
            couponResult.setItemPrice(BigDecimal.ZERO);
            return couponResult;
        }).distinct().collect(Collectors.toMap(couponResult -> Map);*/
        log.info("{}", collect);
        /*collect.stream().filter()*/
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
    @Ignore
    public void endTest() {
        log.info("================================");
        log.info("Test End");
        log.info("================================");
    }

}
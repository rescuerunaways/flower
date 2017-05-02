package com.flower.pack.model;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static java.math.BigDecimal.valueOf;

public class Store {
    public static final Map<String, Map<Integer, BigDecimal>> flowers = createMap();

    public static Set<Integer> getBuckets(String code) {
        return flowers.get(code).keySet();
    }

    private static Map<String, Map<Integer, BigDecimal>> createMap() {

        Flower roses = new Flower("Roses", "R12");
        Flower tulips = new Flower("Tulips", "T58");
        Flower lilies = new Flower("Lilies", "L09");

        Map<Integer, BigDecimal> r = new HashMap<>(2);
        r.put(5, valueOf(6.99));
        r.put(10, valueOf(12.99));

        Map<Integer, BigDecimal> l = new HashMap<>(3);
        l.put(6, valueOf(16.95));
        l.put(9, valueOf(24.95));

        Map<Integer, BigDecimal> t = new HashMap<>(3);
        t.put(3, valueOf(5.95));
        t.put(5, valueOf(9.95));
        t.put(9, valueOf(16.99));

        Map<String, Map<Integer,BigDecimal>> m = new HashMap<>(3);
        m.put(roses.getCode(), r);
        m.put(tulips.getCode(), t);
        m.put(lilies.getCode(), l);

        return m;
    }


}

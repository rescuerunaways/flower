package com.flower.pack.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Store {
    public static final Map<String, Map<Integer, Double>> flowers = createMap();

    public static Set<Integer> getBuckets(String code) {
        return flowers.get(code).keySet();
    }

    private static Map<String, Map<Integer, Double>> createMap() {

        Flower roses = new Flower("Roses", "R12");
        Flower tulips = new Flower("Tulips", "T58");
        Flower lilies = new Flower("Lilies", "L09");

        Map<Integer, Double> r = new HashMap<>(2);
        r.put(5, 6.99);
        r.put(10, 12.99);

        Map<Integer, Double> l = new HashMap<>(3);
        l.put(6, 16.95);
        l.put(9, 24.95);

        Map<Integer, Double> t = new HashMap<>(3);
        t.put(3, 5.95);
        t.put(5, 9.95);
        t.put(9, 16.99);

        Map<String, Map<Integer,Double>> m = new HashMap<>(3);
        m.put(roses.getCode(), r);
        m.put(tulips.getCode(), t);
        m.put(lilies.getCode(), l);

        return m;
    }
}

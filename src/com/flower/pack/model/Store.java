package com.flower.pack.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Store {
    public static final Map<String, Map<Integer, Float>> flowers = createMap();

    public static Set<Integer> getBuckets(String code) {
        return flowers.get(code).keySet();
    }

    private static Map<String, Map<Integer, Float>> createMap() {

        Flower roses = new Flower("Roses", "R12");
        Flower tulips = new Flower("Tulips", "T58");
        Flower lilies = new Flower("Lilies", "L09");

        Map<Integer, Float> r = new HashMap<>(2);
        r.put(5, 6.99f);
        r.put(10, 12.99f);

        Map<Integer, Float> t = new HashMap<>(3);
        t.put(3, 9.95f);
        t.put(6, 16.95f);
        t.put(9, 24.95f);

        Map<Integer, Float> l = new HashMap<>(3);
        l.put(3, 5.95f);
        l.put(5, 9.95f);
        l.put(9, 16.99f);

        Map<String, Map<Integer,Float>> m = new HashMap<>(3);
        m.put(roses.getCode(), r);
        m.put(tulips.getCode(), t);
        m.put(lilies.getCode(), l);

        return m;
    }
}

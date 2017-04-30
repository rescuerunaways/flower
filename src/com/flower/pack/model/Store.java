package com.flower.pack.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Store {
    public static final Map<String, List<Bucket>> flowers = createMap();

    public static List<Integer> getBuckets(String code) {
        return flowers.get(code).stream().map(Bucket::getNumber).collect(Collectors.toList());
    }

    private static Map<String, List<Bucket>> createMap() {

        Flower roses = new Flower("Roses", "R12");
        Flower tulips = new Flower("Tulips", "T58");
        Flower lilies = new Flower("Lilies", "L09");

        List<Bucket> r = new ArrayList<>();
        r.add(new Bucket(5, 6.99f));
        r.add(new Bucket(10, 12.99f));

        List<Bucket> t = new ArrayList<>();
        t.add(new Bucket(3, 9.95f));
        t.add(new Bucket(6, 16.95f));
        t.add(new Bucket(9, 24.95f));

        List<Bucket> l = new ArrayList<>();
        l.add(new Bucket(3, 5.95f));
        l.add(new Bucket(5, 9.95f));
        l.add(new Bucket(9, 16.99f));

        Map<String, List<Bucket>> m = new HashMap<>();
        m.put(roses.getCode(), r);
        m.put(tulips.getCode(), t);
        m.put(lilies.getCode(), l);

        return m;
    }
}

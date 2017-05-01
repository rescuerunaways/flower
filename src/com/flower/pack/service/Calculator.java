package com.flower.pack.service;

import com.flower.pack.model.Order;

import java.util.List;
import java.util.Map;

import static com.flower.pack.model.Store.flowers;

public class Calculator {
    public static Double sum(Order o, List<Integer> pack) {
        Map<Integer, Double> buckets = flowers.get(o.getCode());
        return pack.stream().map(buckets::get).reduce(0.0, Double::sum);
    }
}

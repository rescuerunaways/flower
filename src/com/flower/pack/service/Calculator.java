package com.flower.pack.service;

import com.flower.pack.model.Order;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static com.flower.pack.model.Store.flowers;

public class Calculator {
    public static Optional<Float> sum(Order o, List<Integer> pack) {
        Map<Integer, Float> buckets = flowers.get(o.getCode());
        Optional<Float> sum = pack.stream().map(buckets::get).reduce((x, y) -> x + y);
        return sum;
    }
}

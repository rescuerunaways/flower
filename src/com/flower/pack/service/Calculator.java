package com.flower.pack.service;

import com.flower.pack.model.Order;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import static com.flower.pack.model.Store.flowers;

public class Calculator {
    public static BigDecimal sum(Order o, List<Integer> pack) {
        Map<Integer, BigDecimal> buckets = flowers.get(o.getCode());
        return pack.stream().map(buckets::get).reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}

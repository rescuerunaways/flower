package com.flower.pack.service;

import com.flower.pack.model.Order;
import com.flower.pack.model.Store;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test()
    public void testPack() {
        Optional<Float> result = Calculator.sum(new Order(20, "R12"), Pack.pack(20, Store.getBuckets("R12")));
        assertEquals(25.98f, result.get(), 0);
    }

}



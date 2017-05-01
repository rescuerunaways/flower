package com.flower.pack.service;

import com.flower.pack.model.Order;
import com.flower.pack.model.Store;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    @Test()
    public void testPack() {
        Double result = Calculator.sum(new Order(20, "R12"), Pack.pack(20, Store.getBuckets("R12")));
        assertEquals(Double.parseDouble("25.98"), result, 0);
    }

}



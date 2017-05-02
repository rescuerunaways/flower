package com.flower.pack.service;

import com.flower.pack.excptions.PackException;
import com.flower.pack.model.Order;
import com.flower.pack.model.Store;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    @Test()
    public void testSum() throws PackException {
        Order o = new Order(20, "R12");
        BigDecimal result = Calculator.sum(o, Pack.pack(o, Store.getBuckets("R12")));
        assertEquals(new BigDecimal(25.98), result);
    }
}



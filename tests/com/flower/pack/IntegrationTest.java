package com.flower.pack;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IntegrationTest {

    public static final String inputPath = "./order/raw/order.txt";

    @Test()
    public void testMain() {
        String result = Main.result(inputPath);
        assertTrue(result.contains("R12 10  $12.99"));
        assertTrue(result.contains("R12 10  $12.99"));
        assertTrue(result.contains("R12 10  $12.99"));
        assertTrue(result.contains("L09 15  $41.90"));
        assertTrue(result.contains("T58 13  $25.85"));
    }
}

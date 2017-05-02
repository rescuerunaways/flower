package com.flower.pack;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IntegrationTest {

    public static final String inputPath = "./order.test/raw/order.txt";
    public static final String inputNotParsible = "./order.test/raw/order_not_parsible.txt";
    public static final String inputNotPackable = "./order.test/raw/order_one_unpackable.txt";

    @Test()
    public void testMain() {
        String result = Main.result(inputPath);
        assertTrue(result.contains("R12 10  $12.99"));
        assertTrue(result.contains("R12 10  $12.99"));
        assertTrue(result.contains("R12 10  $12.99"));
        assertTrue(result.contains("L09 15  $41.90"));
        assertTrue(result.contains("T58 13  $25.85"));
    }

    @Test()
    public void testMainException() {
        String result = Main.result(inputNotParsible);
        assertTrue(result.contains("Exception"));
    }

    @Test()
    public void testMainUnpackable() {
        String result = Main.result(inputNotPackable);
        assertTrue(result.contains("Exception"));
    }
}

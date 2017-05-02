package com.flower.pack.model;


import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

import static com.flower.pack.model.Store.getBuckets;
import static org.junit.Assert.assertEquals;

public class StoreTest {

    @Test()
    public void bucketsTest() {
        assertEquals(new HashSet<>(Arrays.asList(5, 10)), getBuckets("R12"));
    }
}

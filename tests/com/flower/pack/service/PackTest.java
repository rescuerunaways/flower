package com.flower.pack.service;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static com.flower.pack.service.Pack.pack;
import static org.junit.Assert.assertEquals;

public class PackTest {
    @Test()
    public void testPack() {
        List<Integer>result = pack(5, new HashSet<>(Arrays.asList(1, 2, 3)));
        assertEquals(Arrays.asList(2, 3) ,result);
    }
}

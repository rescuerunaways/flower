package com.flower.pack.service;

import com.flower.pack.excptions.PackException;
import com.flower.pack.model.Order;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static com.flower.pack.service.Pack.pack;
import static org.junit.Assert.assertEquals;

public class PackTest {
    @Test()
    public void testPack() throws PackException {
        Order o = new Order(5, "R12");

        List<Integer> result = pack(o, new HashSet<>(Arrays.asList(1, 2, 3)));
        assertEquals(Arrays.asList(2, 3), result);
    }

    @Test(expected = PackException.class)
    public void testCantPack() throws PackException {
        Order o = new Order(7, "R12");
        pack(o, new HashSet<>(Arrays.asList(2, 4)));
    }

}

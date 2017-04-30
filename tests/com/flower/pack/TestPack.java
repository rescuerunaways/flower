package com.flower.pack;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.flower.pack.service.Pack.pack;

public class TestPack {
    @Test()
    public void testPack() {
        List<Integer> result = pack(5, new int[]{1, 2, 3});
        Assert.assertEquals(Arrays.asList(2,3),result);
    }
}

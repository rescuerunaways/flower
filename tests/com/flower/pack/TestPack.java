package com.flower.pack;

import org.junit.Assert;
import org.junit.Test;

public class TestPack {
    @Test()
    public void testPack() {
        Pack pack = new Pack();
        int[] result = pack.pack(5, new int[]{1, 2, 3});
        Assert.assertArrayEquals(result, new int[]{42});
    }
}

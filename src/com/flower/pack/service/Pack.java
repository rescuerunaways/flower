package com.flower.pack.service;

import java.util.ArrayList;
import java.util.List;

public class Pack {

    public static List<Integer> pack(int order, int[] bckts) {
        final int[] bcktCache = new int[order + 1];
        final int[] minBcktCache = new int[order + 1];

        for (int i = 0; i <= order; i++) {
            int bcktCount = i;
            int newBckt = 1;
            for (int j : getSmallerBckts(bckts, i)) {
                //TODO add case for equal number, but different price
                if (minBcktCache[i - j] + 1 < bcktCount) {
                    bcktCount = minBcktCache[i - j] + 1;
                    newBckt = j;
                }
            }
            minBcktCache[i] = bcktCount;
            bcktCache[i] = newBckt;
        }
        List<Integer> result = new ArrayList<>(order);
        while (order > 0) {
            int thisBckt = bcktCache[order];
            result.add(thisBckt);
            order = order - thisBckt;
        }
        return result;
    }

    private static int[] getSmallerBckts(int[] bckts, int i) {
        int[] smaller = new int[bckts.length];

        for (int k = 0; k <= bckts.length - 1; k++) {
            if (bckts[k] <= i) {
                smaller[k] = bckts[k];
            }
        }
        return smaller;
    }
}

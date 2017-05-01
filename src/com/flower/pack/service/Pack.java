package com.flower.pack.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Pack {

    public static List<Integer> pack(Integer order, Set<Integer> bckts) {
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

    private static List<Integer> getSmallerBckts(Set<Integer> bckts, int i) {
        return bckts.stream().filter(b -> b <= i).collect(Collectors.toList());
    }
}

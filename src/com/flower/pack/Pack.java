package com.flower.pack;

import java.util.ArrayList;
import java.util.List;

import static com.flower.pack.Cache.bcktCache;
import static com.flower.pack.Cache.minBcktCache;

public class Pack {

    public List<Integer> pack(int order, int[] bckts) {
        updateCache(order, bckts);
        List<Integer> result = new ArrayList<>(order);
        while (order > 0) {
            int thisBckt = bcktCache[order];
            result.add(thisBckt);
            order = order - thisBckt;
        }
        return result;
    }

    private void updateCache(int order, int[] bckts) {
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
    }

    private int[] getSmallerBckts(int[] bckts, int i) {
        int[] smaller = new int[bckts.length];

        for (int k = 0; k <= bckts.length - 1; k++) {
            if (bckts[k] <= i) {
                smaller[k] = bckts[k];
            }
        }
        return smaller;
    }
}

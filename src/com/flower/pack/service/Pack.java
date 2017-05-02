package com.flower.pack.service;

import com.flower.pack.excptions.PackException;
import com.flower.pack.model.Order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Pack {

    public static List<Integer> pack(Order order, Set<Integer> bckts) throws PackException {
        Integer num = order.getNumber();
        final int[] bcktCache = new int[num + 1];
        final int[] minBcktCache = new int[num + 1];

        for (int i = 0; i <= num; i++) {
            int bcktCount = i;

            int newBckt = 0;
            for (int j : getSmallerBckts(bckts, i)) {
                if (minBcktCache[i - j] + 1 < bcktCount) {
                    bcktCount = minBcktCache[i - j] + 1;
                    newBckt = j;
                }
            }
            minBcktCache[i] = bcktCount;
            bcktCache[i] = newBckt;
        }
        List<Integer> result = new ArrayList<>(num);

        if(!checkBucket(num, bcktCache)) {
            throw new PackException(order);
        }

        while (num > 0) {
            int thisBckt = bcktCache[num];
            result.add(thisBckt);
            num = num - thisBckt;
        }
        return result;
    }


    private static List<Integer> getSmallerBckts(Set<Integer> bckts, int i) {
        return bckts.stream().filter(b -> b <= i).collect(Collectors.toList());
    }

    private static boolean checkBucket(Integer order, int[] bckCache) {
        return order.equals(Arrays.stream(bckCache).reduce(0, Integer::sum));
    }
}

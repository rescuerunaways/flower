package com.flower.pack.service;

import com.flower.pack.excptions.PackException;
import com.flower.pack.model.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Pack {
    public static List<Integer> pack(Order order, Set<Integer> bckts) throws PackException {
        Integer num = order.getNumber();
        final int[] bcktCache = new int[num + 1];
        updateCache(bcktCache, order.getNumber(), bckts);
        return pack(order, bcktCache);

    }

    public static void updateCache(int[] bcktCache, Integer num, Set<Integer> bckts) throws PackException {
        final int[] minBckt = new int[num + 1];

        for (int i = 0; i <= num; i++) {
            int bcktCount = i;
            int newBckt = 0;
            for (int j : getSmallerBckts(bckts, i)) {
                if (minBckt[i - j] + 1 < bcktCount) {
                    bcktCount = minBckt[i - j] + 1;
                    newBckt = j;
                    if (newBckt == 0) {
                        bcktCount = 0;
                    }
                }
            }
            minBckt[i] = bcktCount;
            bcktCache[i] = newBckt;
        }
    }

    private static List<Integer> pack(Order o, int[] bcktCache) throws PackException {
        Integer num = o.getNumber();
        List<Integer> result = new ArrayList<>(num);

        while (num > 0) {
            int thisBckt = bcktCache[num];
            if (thisBckt == 0) {
                throw new PackException(o, sumResult(result));
            }
            result.add(thisBckt);
            num = num - thisBckt;
        }
        return result;
    }


    private static List<Integer> getSmallerBckts(Set<Integer> bckts, int i) {
        return bckts.stream().filter(b -> b <= i).collect(Collectors.toList());
    }

    private static Integer sumResult(List<Integer> result) {
        return result.stream().reduce(0, Integer::sum);
    }
}

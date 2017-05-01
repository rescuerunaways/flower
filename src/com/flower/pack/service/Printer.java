package com.flower.pack.service;

import com.flower.pack.model.Order;

import java.util.Comparator;
import java.util.List;

import static com.flower.pack.service.Calculator.sum;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class Printer {

    public static String print(Order o, List<Integer> p) {
        StringBuilder rslt = new StringBuilder();

        rslt.append(o.toString())
            .append("  ")
            .append("$")
            .append(sum(o, p))
            .append("\n");

        for (List<Integer> i : groupPacksSameNumber(p)) {
            rslt.append("    ")
                .append(i.size())
                .append(" x ")
                .append(i.get(0))
                .append("  ")
                .append("$")
                .append(sum(o, i))
                .append("\n");
        }

        rslt.append("\n");
        return rslt.toString();
    }

    private static List<List<Integer>> groupPacksSameNumber(List<Integer> pack) {
        return pack.stream()
            .sorted(Comparator.naturalOrder())
            .collect(groupingBy(s -> s))
            .values().stream()
            .collect(toList());
    }
}






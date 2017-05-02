package com.flower.pack;


import com.flower.pack.excptions.CodeException;
import com.flower.pack.model.Order;

import java.io.IOException;
import java.util.List;

import static com.flower.pack.io.Input.getOrders;
import static com.flower.pack.io.Parser.parse;
import static com.flower.pack.model.Store.getBuckets;
import static com.flower.pack.service.Pack.pack;
import static com.flower.pack.service.Printer.print;

public class Main {
    public static final String inputPath = "./order/raw/order.txt";

    public static void main(String[] args) throws CodeException {
        System.out.print(result(inputPath));
    }

    public static String result(String i) {
        StringBuilder rslt = new StringBuilder();
        try {
            for (String s : getOrders(i)) {
                Order order = parse(s);
                List<Integer> pack = pack(order.getNumber(), getBuckets(order.getCode()));
                rslt.append(print(order, pack));
            }
            return rslt.toString();

        } catch (CodeException | IOException e) {
            return e.getMessage();
        }
    }
}
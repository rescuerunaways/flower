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
    public static final void main(String[] args) throws CodeException {
        try {
            for (String s : getOrders()) {
                Order order = parse(s);
                List<Integer> pack = pack(order.getNumber(), getBuckets(order.getCode()));
                System.out.print(print(order, pack));
            }

        } catch (CodeException | IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
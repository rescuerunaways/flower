package com.flower.pack.excptions;

import com.flower.pack.model.Order;

import static java.lang.String.format;

public class PackException extends Exception {
    public PackException(Order order) {
        super(format("Order '%1$s' cannot be completed due to packing restrictions", order));
    }
}

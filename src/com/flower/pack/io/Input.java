package com.flower.pack.io;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Input {

    public static List<String> getOrders() {
        try {
            return Files.lines(Paths.get("./order/order.txt")).collect(Collectors.toList());
        } catch (IOException e) {

            //TODO: add proper handling
        }
        return null;
    }
}

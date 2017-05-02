package com.flower.pack.io;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;


public class Input {
    public static List<String> getOrders(String i) throws IOException {
        return Files.lines(Paths.get(i)).collect(Collectors.toList());
    }
}

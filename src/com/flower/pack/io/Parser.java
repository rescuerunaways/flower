package com.flower.pack.io;

import com.flower.pack.excptions.CodeException;
import javafx.util.Pair;

import static com.flower.pack.io.Validator.validateCode;

public class Parser {

    public static Pair<String, Integer> parse(String s) throws CodeException {

        String[] strings = s.split("\\s");
        Integer order = Integer.parseInt(strings[0]);
        String code = strings[1];

        validateCode(code);

        return new Pair<>(code, order);

    }
}

package com.flower.pack.io;

import com.flower.pack.excptions.CodeException;
import com.flower.pack.model.Order;

import static com.flower.pack.io.Validator.validateCode;

public class Parser {

    public static Order parse(String s) throws CodeException {

        String[] strings = s.split("\\s");
        Integer order = Integer.parseInt(strings[0]);
        String code = strings[1];

        validateCode(code);

        return new Order(order, code);

    }
}

package com.flower.pack.excptions;

import static java.lang.String.format;

public class CodeException extends Exception {
    public CodeException(String code) {
        super(format("Flower with code '%1$s' does not exist in the shop.", code));
    }
}

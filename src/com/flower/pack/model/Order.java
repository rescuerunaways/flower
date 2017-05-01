package com.flower.pack.model;


public class Order {

    private String  code;
    private Integer number;

    public Order(Integer number, String code) {
        this.number = number;
        this.code = code;
    }

    public Integer getNumber() {
        return number;
    }

    public String getCode() {
        return code;
    }

    public String toString() {
        return this.code + " " + this.number;
    }
}

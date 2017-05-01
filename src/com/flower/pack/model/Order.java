package com.flower.pack.model;


public class Order {

    private String code;


    public Order(Integer number, String code) {
        this.number = number;
        this.code = code;
    }

    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public String getCode() {
        return code;
    }

}

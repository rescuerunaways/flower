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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Order order = (Order) o;

        if (code != null ? !code.equals(order.code) : order.code != null) {
            return false;
        }
        return number != null ? number.equals(order.number) : order.number == null;

    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }
}

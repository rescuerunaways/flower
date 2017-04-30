package com.flower.pack.model;


public class Bucket {

    public Bucket(int number, float price) {
        this.number = number;
        this.price = price;
    }

    private int   number;
    private float price;


    public int getNumber() {
        return number;
    }

    public float getPrice() {
        return price;
    }


}

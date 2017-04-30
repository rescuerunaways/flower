package com.flower.pack.model;


public class Flower {
    public Flower(String name, String code) {
        this.name = name;
        this.code = code;
    }

    private String name;
    private String code;

    public String getName() {
        return name;
    }


    public String getCode() {
        return code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Flower flower = (Flower) o;
        return code.equals(flower.code);
    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }
}

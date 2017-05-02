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

        if (name != null ? !name.equals(flower.name) : flower.name != null) {
            return false;
        }
        return code != null ? code.equals(flower.code) : flower.code == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        return result;
    }
}

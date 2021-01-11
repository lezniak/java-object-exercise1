package com.company;

public abstract class Parcel {
    private String code;
    private int weight;

    public Parcel(int weight, String code) {
        setCode(code);
        setWeight(weight);
    }

    public Parcel() {
        throw new IllegalArgumentException("Podaj dane paczki");
    }



    public void setCode(String code) {
        if (code != null && code.matches("^[A-Z]{3}-[0-9]{5}$")) {
            this.code = code;
        } else{
            throw new IllegalArgumentException("Błędny kod paczki");
        }
        this.code = code;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCode() {
        return code;
    }

    public int getWeight() {
        return weight;
    }

}

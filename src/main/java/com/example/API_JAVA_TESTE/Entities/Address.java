package com.example.API_JAVA_TESTE.Entities;

public class Address {
    private String addresName;
    private Number numberAddres;
    private String stateAddres;

    public Address() {}
    public Address(String addresName, Number numberAddres, String stateAddres) {
        this.addresName = addresName;
        this.numberAddres = numberAddres;
        this.stateAddres = stateAddres;
    }

    public String getAddresName() {
        return addresName;
    }
    public void setAddresName(String addresName) {
        this.addresName = addresName;
    }

    public Number getNumberAddres() {
        return numberAddres;
    }

    public void setNumberAddres(Number numberAddres) {
        this.numberAddres = numberAddres;
    }

    public String getStateAddres() {
        return stateAddres;
    }

    public void setStateAddres(String stateAddres) {
        this.stateAddres = stateAddres;
    }


}

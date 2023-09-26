package com.example.API_JAVA_TESTE.Entities;

public class Products {
    private Long id;
    private String name;
    private Number document;
    private Address address;

    public Products() {}
    public Products(Long id, String name, Number document, Address address) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Number getDocument() {
        return document;
    }

    public void setDocument(Number document) {
        this.document = document;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

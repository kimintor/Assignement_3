package com.example.assignmentproj.model;

import java.util.List;

public class Product {

    private int id;
    private int nOfParts;
    private List<Animal> animalsInProduct;

    public Product(int id, int nOfParts, List<Animal> animalsInProduct) {
        this.id = id;
        this.nOfParts = nOfParts;
        this.animalsInProduct = animalsInProduct;
    }

    public Product(int nOfParts, List<Animal> animalsInProduct) {
        this.nOfParts = nOfParts;
        this.animalsInProduct = animalsInProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getnOfParts() {
        return nOfParts;
    }

    public void setnOfParts(int nOfParts) {
        this.nOfParts = nOfParts;
    }

    public List<Animal> getAnimalsInProduct() {
        return animalsInProduct;
    }

    public void setAnimalsInProduct(List<Animal> animalsInProduct) {
        this.animalsInProduct = animalsInProduct;
    }
}

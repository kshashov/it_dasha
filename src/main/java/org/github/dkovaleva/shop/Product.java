package org.github.dkovaleva.shop;

public class Product {
    private String name;
    private int price;
    private String material;

    public String getNameProduct() {
        return name;
    }

    public void setNameProduct(String newName) {
        name = newName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int newPrise) {
        price = newPrise;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String newMaterial) {
        material = newMaterial;
    }

}

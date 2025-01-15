package org.github.dkovaleva.GamesAndDemons;

import java.util.ArrayList;

public class StoreTest {
    public static void main(String[] args) {
        Product skirt = new Product();
        skirt.setNameProduct("Юбочка");
        String skirtProduct = skirt.getNameProduct();
        skirt.setMaterial("Твид");
        skirt.setPrice(5000);

        Product pants;
        pants = new Product();
        pants.setNameProduct("Штаны");
        pants.setMaterial("Джинса");
        pants.setPrice(3000);

        Product shirt = new Product();
        shirt.setNameProduct("Футболка с котиками");
        shirt.setMaterial("Хлопок");
        shirt.setPrice(2000);


        Store aurora;
        aurora = new Store();
        aurora.setNameStore("Аврора");
        aurora.setAddressStore("ул. Мяги");

        aurora.getProducts().add(skirt);
        aurora.getProducts().add(pants);
        aurora.getProducts().add(shirt);

        ArrayList<Product> auroraProducts = aurora.getProducts();
        auroraProducts.add(skirt);
        auroraProducts.add(pants);
        auroraProducts.add(shirt);

        for (int i = 0; i < auroraProducts.size(); i++) {
            Product product = auroraProducts.get(i);
            System.out.println(product.getNameProduct());
        }

    }
}

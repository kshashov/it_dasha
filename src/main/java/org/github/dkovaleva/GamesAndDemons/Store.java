package org.github.dkovaleva.GamesAndDemons;

import java.util.ArrayList;

public class Store {
    private String name;
    private String address;
    private ArrayList<Product> products = new ArrayList<>();

    public String getNameStore() {
        return name;
    }

    public void setNameStore(String newStoreName) {
        name = newStoreName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddressStore(String newAddressStore) {
        address = newAddressStore;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}

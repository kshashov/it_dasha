package org.github.dkovaleva.shop;

import java.util.ArrayList;
import java.util.HashSet;

public class Store {
    private String name;
    private String address;
    private ArrayList<Product> products = new ArrayList<>();
    private HashSet<Employee> employees = new HashSet<>();

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

    public HashSet<Employee> getEmployees() {
        return employees;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

}

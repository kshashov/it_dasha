package org.github.dkovaleva.shop;

import java.util.ArrayList;
import java.util.List;

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

//        aurora.getProducts().add(skirt);
//        aurora.getProducts().add(pants);
//        aurora.getProducts().add(shirt);

        ArrayList<Product> auroraProducts = aurora.getProducts();
//        aurora.addProduct(skirt);
        aurora.addProduct(skirt);
        aurora.addProduct(pants);
        aurora.addProduct(shirt);

        for (int i = 0; i < auroraProducts.size(); i++) {
            Product product = auroraProducts.get(i);
            System.out.println(product.getNameProduct());
        }


        Employee s = new Employee();
        s.setName("Саша");
        s.setAge(18);
        s.setPosition("Стажер");

        Employee n;
        n = new Employee();
        n.setName("Настя");
        n.setPosition("Менеджер");
        n.setAge(54);

        Employee k = new Employee();
        k.setAge(34);
        k.setName("Киря");
        k.setPosition("Начальник");

        Employee kCopy = new Employee();
        kCopy.setAge(34);
        kCopy.setName("Киря");
        kCopy.setPosition("Начальник");

//        aurora.getEmployees().add(s);
//        aurora.getEmployees().add(n);
//        aurora.getEmployees().add(k);

        aurora.addEmployee(s);
        aurora.addEmployee(s);
        aurora.addEmployee(n);
        aurora.addEmployee(k);
        aurora.addEmployee(kCopy);


//        for (int i = 0; i < aurora.getProducts().size(); i++) {
//            Product product = aurora.getProducts().get(i);
//            System.out.println(product.getNameProduct());
//        }
//
//        for (Product product: aurora.getProducts()) {
//            System.out.println(product.getNameProduct());
//        }

        // add size contains

        for (Employee emp: aurora.getEmployees()) {
            System.out.println(emp.getName());
        }

        System.out.println(aurora.getEmployees().contains(n));

    }
}

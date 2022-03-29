package com.company.collections;

public class Main {
    public static void main(String[] args) {

        Shop mobile = new Shop();
        Product[] products = new Product[]{
                new Product(12, "Sony X1", 350),
                new Product(23, "Xiaomi mi11", 340),
                new Product(43, "Iphone 13", 750),
                new Product(13, "Huawei p50", 600)};

        for (Product p : products
        ) {
            mobile.addProduct(p);
        }

        mobile.sortCost();
        System.out.println(mobile);

        mobile.delProduct(13);
        mobile.addProduct(new Product(15, "Samsung A72", 500));
        System.out.println(mobile);

        mobile.reverse();
        mobile.setProduct(new Product(43, "Samsung S21", 600));
        System.out.println(mobile);

    }

}

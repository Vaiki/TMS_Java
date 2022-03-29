package com.company.collections;

import java.util.*;

public class Shop {
    private final List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        if (productList.stream().noneMatch(it -> (it.getId() == product.getId()))) productList.add(product);
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void delProduct(int id) {
        productList.removeIf(it -> (it.getId() == id));
    }

    public void sortCost() {
        productList.sort(Comparator.comparing(Product::getCost));
    }

    public void reverse() {
        Collections.reverse(productList);
    }

    public void setProduct(Product p) {
        for (Product e : productList
        ) {
            if (e.getId() == p.getId()) {
                e.setName(p.getName());
                e.setCost(p.getCost());
                break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Product p : productList) {
            result.append(p.toString()).append("\n");
        }
        return "-------------------()_()---------------------\n"
                + result;
    }

}

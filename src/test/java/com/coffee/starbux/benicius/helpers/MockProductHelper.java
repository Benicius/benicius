package com.coffee.starbux.benicius.helpers;

import com.coffee.starbux.benicius.domains.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static com.coffee.starbux.benicius.domains.Type.DRINK;

public class MockProductHelper {

    public MockProductHelper() {}

    public static Product mockValidProduct(){
        Product product = new Product();
        product.setType(DRINK);
        product.setPrice(new BigDecimal(1.75));
        product.setName("Coffee");

        return product;
    }

    public static List<Product> mockListValid(){
        List<Product> products = new ArrayList<>();

        products.add(mockValidProduct());
        return products;
    }
}

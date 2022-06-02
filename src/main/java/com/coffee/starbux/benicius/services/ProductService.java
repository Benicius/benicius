package com.coffee.starbux.benicius.services;

import com.coffee.starbux.benicius.domains.Product;
import com.coffee.starbux.benicius.domains.Type;
import com.coffee.starbux.benicius.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product saveProduct(final Product product){
        return productRepository.save(product);
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findProductByNameAndType(final String name, final String type){

        Type typeEnum = null;
        switch (type){
            case "TOPPING":
                typeEnum = Type.TOPPING;
                break;
            case "DRINK":
                typeEnum = Type.DRINK;
                break;
        }

        return productRepository.findByTypeAndName(typeEnum, name);
    }
}

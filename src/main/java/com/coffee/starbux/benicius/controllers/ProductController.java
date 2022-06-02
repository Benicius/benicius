package com.coffee.starbux.benicius.controllers;

import com.coffee.starbux.benicius.domains.Product;
import com.coffee.starbux.benicius.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Product>> findAllProducts(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/filter")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Product> findProductByNameAndType(
            @RequestParam final String name,
            @RequestParam final String type){

        return new ResponseEntity<>(productService.findProductByNameAndType(name, type), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Product> saveProducts(@RequestBody final Product product){
        return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.OK);
    }


}

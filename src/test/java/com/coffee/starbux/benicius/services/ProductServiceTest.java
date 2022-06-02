package com.coffee.starbux.benicius.services;

import com.coffee.starbux.benicius.domains.Product;
import com.coffee.starbux.benicius.repository.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static com.coffee.starbux.benicius.helpers.MockProductHelper.mockListValid;
import static com.coffee.starbux.benicius.helpers.MockProductHelper.mockValidProduct;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ProductServiceTest {

    @InjectMocks ProductService productService;
    @Mock ProductRepository productRepository;

    @Test
    public void shouldReturnCreateProduct(){
        when(productService.saveProduct(any())).thenReturn(mockValidProduct());
        Product product = productService.saveProduct(mockValidProduct());
        assertNotNull(product);
    }

    @Test
    public void shouldReturnFindById(){
        when(productRepository.findAll()).thenReturn(mockListValid());
        List<Product> drink = productService.findAll();

        assertNotNull(drink);
    }
}

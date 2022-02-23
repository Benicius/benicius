/*
package com.coffee.starbux.benicius.controllers;

import com.coffee.starbux.benicius.domains.Cart;
import com.coffee.starbux.benicius.services.CartService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/carts")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/create")
    public ResponseEntity<Cart> saveCart(@RequestBody Cart cart){
        return new ResponseEntity<>(cartService.saveCart(cart), HttpStatus.CREATED);
    }
}
*/

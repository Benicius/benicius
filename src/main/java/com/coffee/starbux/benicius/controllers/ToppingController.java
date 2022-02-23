package com.coffee.starbux.benicius.controllers;

import com.coffee.starbux.benicius.domains.Topping;
import com.coffee.starbux.benicius.services.ToppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/toppings")
public class ToppingController {

    private final ToppingService toppingService;

    @Autowired
    public ToppingController(ToppingService toppingService) {
        this.toppingService = toppingService;
    }

    @PostMapping("/create")
    public ResponseEntity<Topping> saveTipping(@RequestBody Topping topping){
        return new ResponseEntity<>(toppingService.saveTopping(topping), HttpStatus.CREATED);
    }
}

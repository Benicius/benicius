package com.coffee.starbux.benicius.controllers;

import com.coffee.starbux.benicius.domains.Topping;
import com.coffee.starbux.benicius.services.ToppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/toppings")
public class ToppingController {

    private final ToppingService toppingService;

    @Autowired
    public ToppingController(ToppingService toppingService) {
        this.toppingService = toppingService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Topping>> findAll(){
        return new ResponseEntity<>(toppingService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Topping>> findOnlyTopping(@PathVariable("id") Long id){
        return new ResponseEntity<>(toppingService.findOnlyTopping(id), HttpStatus.OK);
    }

    @GetMapping("/filter")
    public ResponseEntity<List<Topping>> findByName(@RequestParam("name") String name){
        return new ResponseEntity<>(toppingService.findByName(name), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Topping> saveTopping(@RequestBody Topping topping){
        return new ResponseEntity<>(toppingService.saveTopping(topping), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Topping> updateTopping(@RequestBody Topping topping){
        return new ResponseEntity<>(toppingService.updateTopping(topping), HttpStatus.CREATED);
    }
}

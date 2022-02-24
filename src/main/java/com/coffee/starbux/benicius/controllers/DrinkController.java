package com.coffee.starbux.benicius.controllers;

import com.coffee.starbux.benicius.domains.Drink;
import com.coffee.starbux.benicius.services.DrinkService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.coffee.starbux.benicius.contants.ApiConstants.ENDPOINT_CREATE_DRINK;
import static com.coffee.starbux.benicius.contants.ApiConstants.ENDPOINT_MESSAGE;

@RestController
@RequestMapping("/api/drinks")
public class DrinkController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DrinkController.class);

    private final DrinkService drinkService;

    @Autowired
    public DrinkController(DrinkService drinkService) {
        this.drinkService = drinkService;
    }

    @GetMapping("/")
    public  ResponseEntity<List<Drink>> findAllDrinks(){
        return new ResponseEntity<>(drinkService.findAllDrinks(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Drink>> findOnlyDrink(@PathVariable("id") Long id){

        return new ResponseEntity<>(drinkService.findOnlyDrink(id), HttpStatus.OK);
    }

    @GetMapping("/filter")
    public ResponseEntity<List<Drink>> findByName(@RequestParam("name") String name){
        return new ResponseEntity<>(drinkService.findByName(name), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Drink> saveDrink(@RequestBody Drink drink){
        final String message = String.format(ENDPOINT_MESSAGE, ENDPOINT_CREATE_DRINK, drink);
        LOGGER.info(message);
        return new ResponseEntity<>(drinkService.saveDrink(drink), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Drink> updateDrink(@RequestBody Drink drink){
        return new ResponseEntity<>(drinkService.saveDrink(drink), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteDrink(@PathVariable("id") Long id){
        drinkService.deleteDrink(id);
    }
}

package com.coffee.starbux.benicius.services;

import com.coffee.starbux.benicius.domains.Drink;
import com.coffee.starbux.benicius.repository.DrinkRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DrinkService {

    private final DrinkRepository drinkRepository;

    public DrinkService(DrinkRepository drinkRepository) {
        this.drinkRepository = drinkRepository;
    }

    public List<Drink> findAllDrinks(){
        return drinkRepository.findAll();
    }

    public Optional<Drink> findOnlyDrink(Long id){
        return drinkRepository.findById(id);
    }

    public Drink findByName(String name){
        return drinkRepository.findByName(name);
    }

    public Drink saveDrink(Drink drink){
        return drinkRepository.save(drink);
    }

    public Drink updateDrink(Drink drink){
        return drinkRepository.save(drink);
    }

    public void deleteDrink(Long id){
        drinkRepository.deleteById(id);
    }
}

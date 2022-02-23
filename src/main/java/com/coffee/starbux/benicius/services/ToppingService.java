package com.coffee.starbux.benicius.services;


import com.coffee.starbux.benicius.domains.Topping;
import com.coffee.starbux.benicius.repository.ToppingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToppingService {

    private final ToppingRepository toppingRepository;

    public ToppingService(ToppingRepository toppingRepository) {
        this.toppingRepository = toppingRepository;
    }

    public List<Topping> findAll(){
        return toppingRepository.findAll();
    }

    public Optional<Topping> findOnlyTopping(Long id){
        return toppingRepository.findById(id);
    }

    public List<Topping> findByName(String name){
        return toppingRepository.findByNameContains(name);
    }

    public Topping saveTopping(Topping topping){
        return toppingRepository.save(topping);
    }

    public Topping updateTopping(Topping topping){
        return toppingRepository.save(topping);
    }
}

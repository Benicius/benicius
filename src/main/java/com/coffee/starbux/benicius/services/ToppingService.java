package com.coffee.starbux.benicius.services;


import com.coffee.starbux.benicius.domains.Topping;
import com.coffee.starbux.benicius.repository.ToppingRepository;
import org.springframework.stereotype.Service;

@Service
public class ToppingService {

    private final ToppingRepository toppingRepository;

    public ToppingService(ToppingRepository toppingRepository) {
        this.toppingRepository = toppingRepository;
    }

    public Topping saveTopping(Topping topping){
        return toppingRepository.save(topping);
    }
}

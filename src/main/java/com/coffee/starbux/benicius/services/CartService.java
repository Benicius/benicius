package com.coffee.starbux.benicius.services;

import com.coffee.starbux.benicius.domains.Cart;
import com.coffee.starbux.benicius.domains.CartItem;
import com.coffee.starbux.benicius.domains.Drink;
import com.coffee.starbux.benicius.repository.CartRepository;
import com.coffee.starbux.benicius.repository.DrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.Optional;

import static org.springframework.util.ObjectUtils.isEmpty;

@Service
public class CartService {

    private final CartRepository cartRepository;
    private final DrinkRepository drinkRepository;

    @Autowired
    public CartService(CartRepository cartRepository, DrinkRepository drinkRepository) {
        this.cartRepository = cartRepository;
        this.drinkRepository = drinkRepository;
    }

    public Cart saveCart(Cart cart){

        if (!isEmpty(cart.getCartItems()) ){
            for (CartItem item: cart.getCartItems()) {
                Optional<Drink> drinkTemp = findDrinkByCart(item.getId());
                /*item.setDrink(drinkTemp);*/

            }
        }
        return cartRepository.save(cart);
    }

    private Optional<Drink> findDrinkByCart(Long id){
        return drinkRepository.findById(id);
    }
}

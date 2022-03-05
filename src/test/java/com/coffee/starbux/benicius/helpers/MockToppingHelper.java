package com.coffee.starbux.benicius.helpers;

import com.coffee.starbux.benicius.domains.Drink;
import com.coffee.starbux.benicius.domains.Topping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.coffee.starbux.benicius.helpers.ConstantsHelperMock.*;

public final class MockToppingHelper {

    public MockToppingHelper() {
    }

    public static Topping mockValidTopping(){
        Topping topping = new Topping();
        topping.setName(TOPPING_NAME);
        topping.setPrice(TOPPING_PRICE);

        return topping;
    }

    public static Topping mockValidToppingUpdated(){
        Topping topping = new Topping();
        topping.setId(TOPPING_ID);
        topping.setName(TOPPING_NAME_UPDATED);

        return topping;
    }

    public static List<Topping> mockListToppings(){
        Topping topping = new Topping();
        topping.setId(TOPPING_ID);
        topping.setName(TOPPING_NAME);
        topping.setPrice(TOPPING_PRICE);

        Topping topping2 = new Topping();
        topping2.setId(2L);
        topping2.setName(TOPPING_NAME_UPDATED);
        topping2.setPrice(new BigDecimal("4.05"));

        List<Topping> toppings = new ArrayList<>();
        toppings.add(topping);
        toppings.add(topping2);
        return toppings;
    }

    public static Optional<Topping> mockFindByIdTopping(){
        Optional<Topping> toppingOptional = Optional.of(new Topping());
        toppingOptional.get().setId(TOPPING_ID);
        toppingOptional.get().setName(TOPPING_NAME);
        toppingOptional.get().setPrice(TOPPING_PRICE);

        return toppingOptional;
    }
}

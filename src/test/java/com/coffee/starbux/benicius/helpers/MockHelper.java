package com.coffee.starbux.benicius.helpers;

import com.coffee.starbux.benicius.domains.Drink;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.coffee.starbux.benicius.helpers.ConstantsHelperMock.*;

public final class MockHelper {

    public MockHelper() {
    }

    public static Drink mockValidDrink(){
        Drink drink = new Drink();
        drink.setName(DRINK_NAME);
        drink.setPrice(DRINK_PRICE);
        return drink;
    }

    public static Drink mockUpdateDrink(){
        Drink drink = new Drink();
        drink.setId(DRINK_ID);
        drink.setName(DRINK_NAME_UPDATED);
        return drink;
    }

    public static List<Drink> mockListOfDrinks(){
        Drink drink = new Drink();
        drink.setName(DRINK_NAME);
        drink.setPrice(DRINK_PRICE);

        Drink drink2 = new Drink();
        drink.setId(DRINK_ID);
        drink.setName(DRINK_NAME_UPDATED);

        List<Drink> drinks = new ArrayList<>();
        drinks.add(drink);
        drinks.add(drink2);
        return drinks;
    }

    public static Optional<Drink> mockFindById(){
        Optional<Drink> drinkOptional = Optional.of(new Drink());
        drinkOptional.get().setId(DRINK_ID);
        drinkOptional.get().setName(DRINK_NAME);
        drinkOptional.get().setPrice(DRINK_PRICE);

        return drinkOptional;
    }

    public static Drink mockDeleted(){
        Drink drink = new Drink();
        return drink;
    }
}

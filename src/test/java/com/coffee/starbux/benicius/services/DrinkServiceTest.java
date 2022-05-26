package com.coffee.starbux.benicius.services;

import com.coffee.starbux.benicius.domains.Drink;
import com.coffee.starbux.benicius.repository.DrinkRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static com.coffee.starbux.benicius.helpers.ConstantsHelperMock.DRINK_ID;
import static com.coffee.starbux.benicius.helpers.ConstantsHelperMock.DRINK_NAME_UPDATED;
import static com.coffee.starbux.benicius.helpers.MockDrinkHelper.*;
import static com.coffee.starbux.benicius.helpers.MockDrinkHelper.mockListOfDrinks;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DrinkServiceTest {

    @InjectMocks DrinkService drinkService;
    @Mock DrinkRepository drinkRepository;

    @Test
    public void shouldReturnCreateDrink(){
        when(drinkRepository.save(any())).thenReturn(mockValidDrink());
        Drink drinkSaved = drinkService.saveDrink(mockValidDrink());
        assertNotNull(drinkSaved);
    }

    @Test
    public void shouldReturnDrinkUpdated(){

        String drinkName = DRINK_NAME_UPDATED;
        when(drinkRepository.save(any())).thenReturn(mockUpdateDrink());
        when(drinkRepository.findByName(any())).thenReturn(mockUpdateDrink());
        drinkService.updateDrink(mockUpdateDrink());
        Drink drinkUpdated = drinkRepository.findByName(drinkName);

        assertEquals(drinkUpdated.getName(), drinkName);
    }

    @Test
    public void shouldReturnListOfDrinks(){

        when(drinkRepository.findAll()).thenReturn(mockListOfDrinks());
        List<Drink> drinks = drinkService.findAllDrinks();

        assertThat(drinks).size().isGreaterThan(1);
    }

    @Test
    public void shouldReturnFindById(){
        when(drinkRepository.findById(any())).thenReturn(mockFindById());
        Optional<Drink> drink = drinkService.findOnlyDrink(DRINK_ID);

        assertNotNull(drink);
    }

    /*@Test
    public void shouldReturnFindByNameContains(){
        when(drinkRepository.findByNameContains(any())).thenReturn(mockListOfDrinks());
        List<Drink> drinks = drinkService.findByName("c");

        assertThat(drinks.get(0).getName()).isEqualTo(DRINK_NAME_UPDATED);
    }*/
}

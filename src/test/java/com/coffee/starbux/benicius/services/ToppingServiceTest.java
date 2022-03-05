package com.coffee.starbux.benicius.services;

import com.coffee.starbux.benicius.domains.Topping;
import com.coffee.starbux.benicius.repository.ToppingRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static com.coffee.starbux.benicius.helpers.ConstantsHelperMock.*;
import static com.coffee.starbux.benicius.helpers.MockToppingHelper.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ToppingServiceTest {

    @InjectMocks ToppingService toppingService;
    @Mock ToppingRepository toppingRepository;

    @Test
    public void shouldReturnCreateTopping(){
        when(toppingRepository.save(any())).thenReturn(mockValidTopping());
        Topping topping = toppingService.saveTopping(mockValidTopping());
        assertNotNull(topping);
    }

    @Test
    public void shouldReturnToppingUpdated(){

        String toppingName = TOPPING_NAME_UPDATED;
        when(toppingRepository.save(any())).thenReturn(mockValidToppingUpdated());
        when(toppingRepository.findByName(any())).thenReturn(mockValidToppingUpdated());
        toppingService.updateTopping(mockValidToppingUpdated());
        Topping toppingUpdated = toppingRepository.findByName(toppingName);

        assertEquals(toppingUpdated.getName(), toppingName);
    }

    @Test
    public void shouldReturnListOfToppings(){
        when(toppingRepository.findAll()).thenReturn(mockListToppings());
        List<Topping> toppings = toppingService.findAll();

        assertThat(toppings).size().isGreaterThan(1);
    }

    @Test
    public void shouldReturnFindById(){
        when(toppingRepository.findById(any())).thenReturn(mockFindByIdTopping());
        Optional<Topping> topping = toppingService.findOnlyTopping(TOPPING_ID);
        assertNotNull(topping);
    }

    @Test
    public void shouldReturnFindByNameContains(){
        when(toppingRepository.findByNameContains(any())).thenReturn(mockListToppings());
        List<Topping> toppings = toppingService.findByName("l");

        assertThat(toppings.get(1).getName()).isEqualTo(TOPPING_NAME_UPDATED);
    }


}

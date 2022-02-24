package com.coffee.starbux.benicius.repository;

import com.coffee.starbux.benicius.domains.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface DrinkRepository extends JpaRepository<Drink, Long> {

    List<Drink> findByNameContains(String name);
    Drink findByName(String name);
}

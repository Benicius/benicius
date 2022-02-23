package com.coffee.starbux.benicius.repository;

import com.coffee.starbux.benicius.domains.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface DrinkRepository extends JpaRepository<Drink, Long> {
}

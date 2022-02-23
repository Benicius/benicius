package com.coffee.starbux.benicius.repository;

import com.coffee.starbux.benicius.domains.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface ToppingRepository extends JpaRepository<Topping, Long> {

    List<Topping> findByNameContains(String name);
}

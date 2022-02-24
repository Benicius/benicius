package com.coffee.starbux.benicius.repository;

import com.coffee.starbux.benicius.domains.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CartRepository extends JpaRepository<Cart, Long> {
}

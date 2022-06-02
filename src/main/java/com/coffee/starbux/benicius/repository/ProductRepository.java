package com.coffee.starbux.benicius.repository;

import com.coffee.starbux.benicius.domains.Product;
import com.coffee.starbux.benicius.domains.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByTypeAndName(final Type type, final String Name);

    List<Product> findByNameContains(final String name);
}

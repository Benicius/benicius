package com.coffee.starbux.benicius.domains;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

@Entity
public class Drink extends Product{

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

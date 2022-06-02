package com.coffee.starbux.benicius.domains;

public enum Type {

    TOPPING("TOPPING"),
    DRINK("DRINK");

    private String description;

    private Type(String desc){
        this.description = desc;
    }

    public String getDescription() {
        return this.description;
    }
}

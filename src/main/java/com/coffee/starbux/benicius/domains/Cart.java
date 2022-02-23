/*
package com.coffee.starbux.benicius.domains;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @NotNull
    private List<CartItem> cartItems;

    private BigDecimal totalCart;

    private boolean hasTopping;

    private CartStatus cartStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public BigDecimal getTotalCart() {
        return totalCart;
    }

    public void setTotalCart(BigDecimal totalCart) {
        this.totalCart = totalCart;
    }

    public boolean isHasTopping() {
        return hasTopping;
    }

    public void setHasTopping(boolean hasTopping) {
        this.hasTopping = hasTopping;
    }

    public CartStatus getCartStatus() {
        return cartStatus;
    }

    public void setCartStatus(CartStatus cartStatus) {
        this.cartStatus = cartStatus;
    }
}
*/

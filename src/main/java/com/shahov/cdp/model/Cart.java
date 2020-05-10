package com.shahov.cdp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Le on 1/11/2016.
 */

@Entity
public class Cart implements Serializable {

    private static final long serialVersionUID = 3940548625296145582L;

    @Id
    @GeneratedValue
    private int cartId;


    private String sessionId;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<CartItem> cartItems;

    @OneToOne
    @JoinColumn(name = "id")
    @JsonIgnore
    private User user;

    private double grandTotal;

    public int getCartId() {
        return cartId;
    }

    public Cart(String sessionId) {
        this.sessionId = sessionId;
    }

    public Cart() {
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public void removeCartItem(CartItem cartItem){
        cartItems.remove(cartItem);
    }

    public void addCartItem(CartItem cartItem){
        cartItems.add(cartItem);
    }
}

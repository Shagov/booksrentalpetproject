package com.shahov.cdp.service;

import com.shahov.cdp.model.Book;
import com.shahov.cdp.model.Cart;
import com.shahov.cdp.model.CartItem;
import com.shahov.cdp.repositories.BookRepository;
import com.shahov.cdp.repositories.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    CartRepository cartRepository;

    @Autowired
    BookService bookService;

    public Cart getById(String sessionId){
        return cartRepository.getBySessionId(sessionId);
    }


    public void addToCartById(String productId, String sessionId){
        Cart cart = cartRepository.getBySessionId(sessionId);

        if(cart == null) {
            cart = new Cart(sessionId);
        }

        Book product = bookService.getBookById(productId);

        if (product == null) {
            throw new IllegalArgumentException(new Exception());
        }

        cart.addCartItem(new CartItem(product));
        cartRepository.save(cart);
    }

    public void removeFromCartById(String productId, String sessionId){
        Cart cart = cartRepository.getBySessionId(sessionId);

        if(cart == null) {
            return;
        }
        Book product = bookService.getBookById(productId);
        if (product == null) {
            throw new IllegalArgumentException(new Exception());
        }
        CartItem cartItem = new CartItem(product);
        cart.removeCartItem(cartItem);

        cartRepository.save(cart);

    }

    public void updateCart(String sessionId, Cart cart){
        Cart cartToUpdate = cartRepository.getBySessionId(sessionId);
        cart.setCartId(cartToUpdate.getCartId());
        cartRepository.save(cartToUpdate);
    }

    public void deleteCart(String sessionId){
        Cart cart = cartRepository.getBySessionId(sessionId);
        cartRepository.delete(cart);
    }
}

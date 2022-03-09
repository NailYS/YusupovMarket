package ru.nail.shop.yusupovmarket.service;

import ru.nail.shop.yusupovmarket.model.Cart;


import java.util.List;


public interface CartService {

    List<Cart> getAllCart();

    Cart addToCart(Cart cartDto);

    void removeToCart(int id);
}

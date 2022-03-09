package ru.nail.shop.yusupovmarket.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.nail.shop.yusupovmarket.model.Cart;
import ru.nail.shop.yusupovmarket.repository.CartDtoRepository;
import ru.nail.shop.yusupovmarket.service.CartService;

import java.util.List;


@Service
@RequiredArgsConstructor

public class CartServiceImpl implements CartService {

    private final CartDtoRepository cartDtoRepository;

    @Override
    public List<Cart> getAllCart() {
        return cartDtoRepository.findAll();
    }

    @Override
    public Cart addToCart(Cart cartDto) {
        return cartDtoRepository.save(cartDto);
    }

    @Override
    public void removeToCart(int id) {
        cartDtoRepository.deleteById(id);
    }
}


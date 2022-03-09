package ru.nail.shop.yusupovmarket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.nail.shop.yusupovmarket.model.Cart;
import ru.nail.shop.yusupovmarket.service.CartService;

import java.util.List;

@RestController
@RequestMapping("/cart")
@RequiredArgsConstructor
public class BucketController {

    private final CartService cartService;

    @GetMapping
    public List<Cart> getAllCart() {
        return cartService.getAllCart();
    }

    @PostMapping()
    public Cart addToCart(@RequestBody Cart cartDto) {
        return cartService.addToCart(cartDto);
    }

    @DeleteMapping("/{id}")
    public void removeToCart(@PathVariable(name = "id") Integer id) {
        cartService.removeToCart(id);
    }
}

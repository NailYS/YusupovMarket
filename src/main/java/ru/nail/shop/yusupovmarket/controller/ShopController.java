package ru.nail.shop.yusupovmarket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nail.shop.yusupovmarket.model.Shop;
import ru.nail.shop.yusupovmarket.service.ShopService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/shop")
public class ShopController {

    private final ShopService shopService;

    @GetMapping
    public List<Shop> getInformationAboutShop() {
        return shopService.getInformationAboutShop();
    }
}

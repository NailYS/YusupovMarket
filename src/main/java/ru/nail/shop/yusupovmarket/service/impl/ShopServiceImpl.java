package ru.nail.shop.yusupovmarket.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.nail.shop.yusupovmarket.model.Shop;
import ru.nail.shop.yusupovmarket.repository.ShopRepository;
import ru.nail.shop.yusupovmarket.service.ShopService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShopServiceImpl implements ShopService {
    private final ShopRepository shopRepository;

    @Override
    public List<Shop> getInformationAboutShop() {
        return shopRepository.findAll();
    }
}

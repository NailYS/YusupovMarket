package ru.nail.shop.yusupovmarket.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ru.nail.shop.yusupovmarket.model.Shop;

import java.util.List;

@Repository
public interface ShopRepository extends CrudRepository<Shop, Integer> {
    List<Shop> findAll();
}

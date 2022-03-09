package ru.nail.shop.yusupovmarket.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.nail.shop.yusupovmarket.model.Cart;

import java.util.List;

@Repository
public interface CartDtoRepository extends CrudRepository<Cart, Integer> {
    List<Cart> findAll();

}

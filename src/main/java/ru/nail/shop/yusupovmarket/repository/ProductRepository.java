package ru.nail.shop.yusupovmarket.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.nail.shop.yusupovmarket.model.Goods;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Goods, Integer> {
    List<Goods> findAll();
    Goods findProductById(int id);
}

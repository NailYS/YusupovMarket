package ru.nail.shop.yusupovmarket.service;

import ru.nail.shop.yusupovmarket.model.Goods;

import java.util.List;

public interface ProductService {
    List<Goods> getAllProducts();

    Goods getProductById(int id);

    Goods createNewProduct(Goods goods);

    Goods updateProduct(int id, Goods goods);

    void deleteProductById(int id);
}

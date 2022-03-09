package ru.nail.shop.yusupovmarket.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.nail.shop.yusupovmarket.model.Goods;
import ru.nail.shop.yusupovmarket.repository.ProductRepository;
import ru.nail.shop.yusupovmarket.service.ProductService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;


    @Override
    public List<Goods> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Goods getProductById(int id) {
        return productRepository.findProductById(id);
    }

    @Override
    public Goods createNewProduct(Goods goods) {
        return productRepository.save(goods);
    }

    @Override
    public Goods updateProduct(int id, Goods goods) {
        return null;
    }

    @Override
    public void deleteProductById(int id) {
        productRepository.deleteById(id);
    }
}

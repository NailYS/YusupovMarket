package ru.nail.shop.yusupovmarket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.nail.shop.yusupovmarket.model.Goods;
import ru.nail.shop.yusupovmarket.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;


    @GetMapping
    public List<Goods> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Goods getProductById(@PathVariable(name = "id") Integer id) {
        return productService.getProductById(id);
    }

    @PostMapping()
    public Goods createNewProduct(@RequestBody Goods goods) {
        return productService.createNewProduct(goods);
    }

    @PatchMapping("/{id}")
    public Goods updateProduct(@PathVariable(name = "id") Integer id, @RequestBody Goods goods) {
        return productService.updateProduct(id, goods);
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable(name = "id") Integer id) {
        productService.deleteProductById(id);
    }
}

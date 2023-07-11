package com.FoodDelivery.service;

import com.FoodDelivery.entity.Product;

import java.util.List;

public interface ProductService {

    Product getProductById(long id);
    List<Product> getAllProducts();
    void addProduct(Product product);
    void updateProduct(long id ,Product product);
    void deleteProduct(long id);
}

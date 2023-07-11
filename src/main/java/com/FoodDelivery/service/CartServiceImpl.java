package com.FoodDelivery.service;

import com.FoodDelivery.entity.Cart;
import com.FoodDelivery.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService{

   @Autowired
   private CartRepository cartRepository;

    @Override
    public Cart getCartById(long id) {
        return cartRepository.findById(id).get();
    }

    @Override
    public List<Cart> getAllCarts() {
        return (List<Cart>) cartRepository.findAll();
    }

    @Override
    public void addCart(Cart cart) {
        cartRepository.save(cart);
    }

    @Override
    public void updateCart(long id, Cart cart) {
        cartRepository.save(cart);
    }

    @Override
    public void deleteCart(long id) {
        cartRepository.deleteById(id);
    }
}

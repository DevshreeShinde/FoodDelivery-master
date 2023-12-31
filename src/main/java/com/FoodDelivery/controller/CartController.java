package com.FoodDelivery.controller;

import com.FoodDelivery.entity.Cart;
import com.FoodDelivery.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("/cart")
    public List<Cart> getAllCarts(){
        return cartService.getAllCarts();
    }

    @GetMapping("/cart/{id}")
    public Cart getCartById(@PathVariable long id){
        return cartService.getCartById(id);
    }

    @PostMapping("/cart/add")
    public ResponseEntity<String> addCart(@RequestBody Cart cart){
        cartService.addCart(cart);
        return new ResponseEntity<String>("Cart Added", HttpStatus.OK);
    }

    @PutMapping("/cart/update/{id}")
    public ResponseEntity<String> updateCart(@PathVariable long id,@RequestBody Cart cart){
        cartService.updateCart(id, cart);
        return new ResponseEntity<String>("Cart Updated", HttpStatus.OK);
    }

    @DeleteMapping("/cart/delete/{id}")
    public ResponseEntity<String> deleteCart(@PathVariable long id){
        cartService.deleteCart(id);
        return new ResponseEntity<String>("Cart Deleted", HttpStatus.OK);
    }
}

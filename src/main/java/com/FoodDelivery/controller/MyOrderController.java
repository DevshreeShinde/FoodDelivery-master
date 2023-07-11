package com.FoodDelivery.controller;

import com.FoodDelivery.entity.MyOrders;
import com.FoodDelivery.service.MyOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class MyOrderController {

    @Autowired
    private MyOrderService myorder;

    @GetMapping("/order")
    public List<MyOrders> getAllOrder(){
        return myorder.getAllOrder();
    }

    @GetMapping("/order/{id}")
    public MyOrders  getOrderById(@PathVariable long id){
        return myorder.getOrderById(id);
    }

    @PostMapping("/order/add")
    public ResponseEntity<String> addOrder(@RequestBody MyOrders order){
        myorder.addOrder(order);
        return new ResponseEntity<String>("order Added", HttpStatus.OK);
    }

    @PutMapping("/order/update/{id}")
    public ResponseEntity<String> updateOrder(@PathVariable long id,@RequestBody MyOrders order){
        myorder.UpdateOrder(id, order);
        return new ResponseEntity<String>("order Updated", HttpStatus.OK);
    }

    @DeleteMapping("/order/delete/{id}")
    public ResponseEntity<String> deleteOrder(@PathVariable long id){
        myorder.DeleteOrder(id);
        return new ResponseEntity<String>("order Deleted", HttpStatus.OK);
    }
}

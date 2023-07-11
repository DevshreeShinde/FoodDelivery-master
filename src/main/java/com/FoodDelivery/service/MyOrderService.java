package com.FoodDelivery.service;

import com.FoodDelivery.entity.MyOrders;

import java.util.List;

public interface MyOrderService {


    MyOrders getOrderById(long id);
    List<MyOrders> getAllOrder();
    void addOrder(MyOrders order);
    void UpdateOrder(long id, MyOrders order);
    void DeleteOrder(long id);
}

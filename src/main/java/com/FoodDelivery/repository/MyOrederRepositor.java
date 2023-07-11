package com.FoodDelivery.repository;

import com.FoodDelivery.entity.MyOrders;
import org.springframework.data.repository.CrudRepository;

public interface MyOrederRepositor extends CrudRepository<MyOrders,Long> {
}

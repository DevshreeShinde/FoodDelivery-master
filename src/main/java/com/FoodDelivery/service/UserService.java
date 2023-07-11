package com.FoodDelivery.service;

import com.FoodDelivery.entity.UserSignUp;

import java.util.List;

public interface UserService {

    List<UserSignUp> getAllUsers();
    void addUser(UserSignUp user);
    void updateUser(String email, UserSignUp user);
}

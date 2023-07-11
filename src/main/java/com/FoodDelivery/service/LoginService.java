package com.FoodDelivery.service;

import com.FoodDelivery.entity.Login;

import java.util.List;

public interface LoginService {

    List<Login> getAllLogins();
    void addLogin(Login login);
}

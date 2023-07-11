package com.FoodDelivery.service;

import com.FoodDelivery.entity.AdminLogin;

import java.util.List;

public interface AdminService {

    List<AdminLogin> getAllAdmin();

    void addAdmin(AdminLogin admin);

}

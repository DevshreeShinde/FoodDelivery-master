package com.FoodDelivery.service;

import com.FoodDelivery.entity.AdminLogin;
import com.FoodDelivery.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminserviceImpl implements AdminService{

    @Autowired
    private AdminRepository adminRepo;
    @Override
    public List<AdminLogin> getAllAdmin() {
        return (List<AdminLogin>) adminRepo.findAll();
    }

    @Override
    public void addAdmin(AdminLogin admin) {
        adminRepo.save(admin);
    }
}

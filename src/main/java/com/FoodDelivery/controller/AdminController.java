package com.FoodDelivery.controller;


import com.FoodDelivery.entity.AdminLogin;
import com.FoodDelivery.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/admins")
    public List<AdminLogin> getAllAdmin(){
        return adminService.getAllAdmin();
    }

    @PostMapping("/admin/add")
        public ResponseEntity<String> addAdmin(@RequestBody AdminLogin admin){
        adminService.addAdmin(admin);
        return  new ResponseEntity<>("Admin is Added", HttpStatus.OK);
    }

}

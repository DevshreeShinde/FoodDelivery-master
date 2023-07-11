package com.FoodDelivery.repository;

import com.FoodDelivery.entity.AdminLogin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<AdminLogin,Long> {
}

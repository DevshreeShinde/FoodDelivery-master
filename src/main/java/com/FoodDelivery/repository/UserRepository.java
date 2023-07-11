package com.FoodDelivery.repository;

import com.FoodDelivery.entity.UserSignUp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserSignUp, String> {
}

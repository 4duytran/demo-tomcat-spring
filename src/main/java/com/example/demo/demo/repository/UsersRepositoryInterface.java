package com.example.demo.demo.repository;


import com.example.demo.demo.entity.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;


public interface UsersRepositoryInterface extends MongoRepository<Users, String> {

    List<Users> findByCategoryName(String name);

}

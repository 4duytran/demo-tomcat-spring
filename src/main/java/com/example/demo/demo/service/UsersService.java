package com.example.demo.demo.service;

import com.example.demo.demo.entity.Categories;
import com.example.demo.demo.entity.Users;
import com.example.demo.demo.repository.UsersRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class UsersService {

    @Autowired
    private UsersRepositoryInterface usersRepository;

    public Collection<Users> getAllUsers() {
        return usersRepository.findAll();
    }
}

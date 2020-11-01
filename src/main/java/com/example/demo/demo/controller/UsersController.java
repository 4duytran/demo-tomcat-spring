package com.example.demo.demo.controller;

import com.example.demo.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/")
    public String displayHome(Model model) {

        model.addAttribute("users", usersService.getAllUsers());
        model.addAttribute("welcome", "Hello from Docker Tomcat server");
        return "home-welcome";
    }
}

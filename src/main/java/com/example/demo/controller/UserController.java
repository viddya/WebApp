package com.example.demo.controller;

import com.example.demo.dto.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/")
    public String index() {
        return "DefaultController!";
    }

    @RequestMapping("/user")
    public User getUser() {
        User testUser = new User();
        testUser.setFirstName("Vidya");
        testUser.setLastName("Karuna");

        return testUser;

    }
}

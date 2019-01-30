package com.example.demo.controller;

import com.example.demo.dto.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
public class UserController {

    @RequestMapping("/")
    public String index() {
        return "DefaultController!";
    }

    private UserService userService;

    @Autowired
    public UserController(UserService userService)
    {
        this.userService = userService;
    }

    @RequestMapping("/user")
    public User getUser() {
        User testUser = new User();


        testUser = userService.getUserById(1L);
        return testUser;

    }

    public List<User> getUser() {


        testUser = userService.getUserById(1L);
        return testUser;

    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public void createUser(User user){
        System.out.println("User created");
    }
}

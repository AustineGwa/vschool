package com.gwazasoftwares.vschool.controllers;

import com.gwazasoftwares.vschool.Models.User;
import com.gwazasoftwares.vschool.Models.Subject;
import com.gwazasoftwares.vschool.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api-v1/users")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/all")
    public List<User>  getAllUsers() {
      return   userService.getAllUsers();
    }

    @PostMapping
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }
}

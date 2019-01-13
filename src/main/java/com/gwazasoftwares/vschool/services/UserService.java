package com.gwazasoftwares.vschool.services;

import com.gwazasoftwares.vschool.Models.User;
import com.gwazasoftwares.vschool.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public List<User> getAllUsers() {
        return  userRepository.findAll();
    }

    public void addUser(User user) {
        userRepository.save(user);
    }
}

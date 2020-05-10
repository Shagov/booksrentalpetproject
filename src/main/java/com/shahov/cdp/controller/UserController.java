package com.shahov.cdp.controller;

import com.shahov.cdp.model.User;
import com.shahov.cdp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public User getUserById(long id){
        return userService.getUserById(id);
    }

    public User getUserByEmail(String email){
        return userService.getUserByEmail(email);
    }

}

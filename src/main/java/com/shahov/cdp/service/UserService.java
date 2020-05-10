package com.shahov.cdp.service;

import com.shahov.cdp.model.User;
import com.shahov.cdp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserById(long id){
       return userRepository.getById(id);
    }

    public User getUserByEmail(String email){
        return userRepository.getByEmail(email);
    }

}

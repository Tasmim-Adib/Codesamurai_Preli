package com.example.CodeSamrurai.Service;

import com.example.CodeSamrurai.Model.Users;
import com.example.CodeSamrurai.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    public UserRepository userRepository;

    public Users saveUser(Users user){
        return userRepository.save(user);
    }
}

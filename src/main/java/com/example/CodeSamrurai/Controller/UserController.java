package com.example.CodeSamrurai.Controller;

import com.example.CodeSamrurai.Model.Users;
import com.example.CodeSamrurai.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class UserController {
    @Autowired
    public UserService userService;

    @PostMapping("/users")
    public ResponseEntity<?> add(@RequestBody Users user){
        try{
            Users savedUser = userService.saveUser(user);
            return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
        }catch (Exception e) {
            String errorMessage = "An error occured";
            return new ResponseEntity<>(errorMessage,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

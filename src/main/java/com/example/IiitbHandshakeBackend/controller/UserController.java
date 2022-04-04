package com.example.IiitbHandshakeBackend.controller;

import com.example.IiitbHandshakeBackend.entity.LoginRequest;
import com.example.IiitbHandshakeBackend.entity.User;
import com.example.IiitbHandshakeBackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity<?> addUser(@RequestBody User user){
        user = userService.addUser(user);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/validate")
    public ResponseEntity<?> signinUser(@RequestBody LoginRequest loginRequest){
        System.out.println(loginRequest);
        return ResponseEntity.ok(userService.signinUser(loginRequest));
    }

    @PostMapping("/reset")
    public ResponseEntity<?> resetPassword(@RequestBody LoginRequest loginRequest){
        return ResponseEntity.ok(userService.resetPassword(loginRequest));
    }
}

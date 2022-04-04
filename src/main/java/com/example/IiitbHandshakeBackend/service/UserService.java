package com.example.IiitbHandshakeBackend.service;

import com.example.IiitbHandshakeBackend.entity.LoginRequest;
import com.example.IiitbHandshakeBackend.entity.User;
import com.example.IiitbHandshakeBackend.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public User addUser(User user){
        try {
            user.setActive(true);
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            user = userRepo.save(user);
        } catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }

    public boolean signinUser(LoginRequest loginRequest){
        User user = userRepo.findByUsername(loginRequest.getUsername());
//        loginRequest.setPassword(passwordEncoder.encode(loginRequest.getPassword()));
        System.out.println(loginRequest.getPassword());
        System.out.println(user.getPassword());
        if(passwordEncoder.matches(loginRequest.getPassword(), user.getPassword()) && user.getRole().equals(loginRequest.getRole()) && user.isActive()){
            return true;
        }
        return false;
    }

    public Boolean resetPassword(LoginRequest request){
        User user = userRepo.findByUsername(request.getUsername());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        try {
            userRepo.save(user);
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}

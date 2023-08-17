package com.example.socset.controller;

import com.example.socset.dao.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserRepository userRepository;

    public AuthenticationResponse register(RegisterRequest request){
        var user = User.builder()
                .username(request.getUsername())
                .password(request.getPassword())
                .
                .build()
        return null;
    }

    public AuthenticationResponse authenticate(RegisterRequest request){
        return null;
    }
}

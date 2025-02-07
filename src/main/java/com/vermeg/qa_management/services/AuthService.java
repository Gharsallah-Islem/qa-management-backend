package com.vermeg.qa_management.services;

import com.vermeg.qa_management.entities.User;
import com.vermeg.qa_management.repositories.UserRepository;
import com.vermeg.qa_management.exceptions.ResourceNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User register(User user) {
        if(userRepository.findByUsername(user.getUsername()).isPresent()){
            throw new RuntimeException("Username is already taken");
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public User login(String username, String password) {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with username: " + username));
        if(passwordEncoder.matches(password, user.getPassword())){
            return user;
        } else {
            throw new RuntimeException("Invalid credentials");
        }
    }
}

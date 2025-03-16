package com.example.Java_Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private final AuthService authService;

    public AuthController(AuthService authService){
        this.authService = authService;
    }

    @PostMapping("/register")
    public String register(@RequestParam String username, @RequestParam String password) {
        authService.register(username,password);
        return "Registered Successfully";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        String token = authService.login(username, password);
        if (token == null) {
            return "Invalid credentials";
        }
        return token;
    }
}

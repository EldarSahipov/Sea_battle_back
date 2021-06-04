package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/register_now")
    public String register_now() {
        return "register_now";
    }
    
    @GetMapping("/game")
    public String game() {
        return "game";
    }

    @GetMapping("/main")
    public String main() {
        return "main";
    }

    @GetMapping("/registration_completed")
    public String register_completed() {
        return "registration_completed";
    }
}

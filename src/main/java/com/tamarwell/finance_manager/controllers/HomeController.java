package com.tamarwell.finance_manager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String handleWelcome() {
        return "home";
    }

    @GetMapping("/login")
    public String handleLogin() {
        return "login";
    }

    @GetMapping("/register")
    public String handleRegister() {
        return "register";
    }

    @GetMapping("/home/user")
    public String handleUserHome() {
        return "userHome";
    }

    @GetMapping("/home/admin")
    public String handleAdminHome() {
        return "adminHome";
    }
}

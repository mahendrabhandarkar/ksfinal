package com.ks.ksfinal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping({"/", "/index.html"})
    public String home() {
        return "estartup/index";
    }

    @GetMapping("/service-details.html")
    public String serviceDetails() {
        return "estartup/service-details";
    }

    @GetMapping("/starter-page.html")
    public String starterPage() {
        return "estartup/starter-page";
    }

    @GetMapping({"/login","/login.html"})
    public String login() {
        return "login";
    }
}
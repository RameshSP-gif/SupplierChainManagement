package com.example.SpringBootProject;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Hello, Thymeleaf!");
        return "index"; // This corresponds to index.html
    }
    
    @PostMapping("/submit")
    public String submitForm(@ModelAttribute User user, Model model) {
        model.addAttribute("message", "Submitted: " + user.getName());
        return "index";
    }

   
    @GetMapping("/login")
    public String login(Model model) {
        //model.addAttribute("message", "Hello, Thymeleaf!");
        return "login"; // This corresponds to index.html
    }
}


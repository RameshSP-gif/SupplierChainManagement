package com.example.SpringBootProject;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World! Springbootjhhkjhjk";
    }
    
    @GetMapping("/hi")
    public String sayHi() {
        return "Hi, World!";
    }
    
    @GetMapping("/gm")
    public String sayGM() {
        return "Hi, GM!";
    }
}

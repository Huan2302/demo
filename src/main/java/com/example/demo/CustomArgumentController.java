package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomArgumentController {

    @GetMapping("/hello")
    public String custom() {
        return "Hello word";
    }
}

package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaginaInicial {

    @GetMapping("/")
    String home() {
        return "Olá Spring Boot!!";
    }
}
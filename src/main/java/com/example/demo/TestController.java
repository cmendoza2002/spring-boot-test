package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/saludo")
    public String hola()
    {
        return "hola mundo desde controlador en openshift...";
    }
}

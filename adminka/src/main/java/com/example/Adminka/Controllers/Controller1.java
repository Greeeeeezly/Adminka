package com.example.Adminka.Controllers;

import com.example.Adminka.Models.Car;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class Controller1 {
    @GetMapping
    public Car getEntityOne() {
        return new Car(1L, "Entity One");
    }
}
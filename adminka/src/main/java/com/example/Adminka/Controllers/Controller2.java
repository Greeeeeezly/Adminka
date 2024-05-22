package com.example.Adminka.Controllers;

import com.example.Adminka.Models.Bus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entity-two")
public class Controller2 {
    @GetMapping
    public Bus getEntityTwo() {
        return new Bus(1L, "Bus1");
    }
}
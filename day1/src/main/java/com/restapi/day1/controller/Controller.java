package com.restapi.day1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/nithin")
    public String get(){
        return "Ronaldo siiuuuuuuu";
    }
}

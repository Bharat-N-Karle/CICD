package com.food;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(path = "/home")
    public void print(){
        System.out.println("Calling from controller");
    }
}

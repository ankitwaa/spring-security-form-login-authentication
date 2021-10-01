package com.example.springsecurityformloginauthentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @GetMapping("/secure/resource")
    public String secure(){
        return "Secured URL";
    }
}

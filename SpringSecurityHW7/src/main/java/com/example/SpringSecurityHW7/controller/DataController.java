package com.example.SpringSecurityHW7.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
    @GetMapping("/public-data")
    public String getPublicData(){
        return "Public data accessed!";
    }

    @GetMapping("/private-data")
    public String getPrivateData(){
        return "Private data accessed!";
    }
}

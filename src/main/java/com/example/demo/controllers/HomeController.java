package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class HomeController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String home()
    {
        return "Dan booted and Spring Booted!";
    }
}

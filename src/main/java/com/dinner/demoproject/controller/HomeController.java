package com.dinner.demoproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String greet(){

        return ("hello world");
    }

    @RequestMapping("/about")
    public Integer about(){

        return(55);
    }
}

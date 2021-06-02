package com.example.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class controller {
    @RequestMapping({"/hello"})
    public String hello(){
        return "Hello world";
    }
}

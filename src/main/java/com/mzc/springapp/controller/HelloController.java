package com.mzc.springapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping(value = "api/v1/hello")
public class HelloController {

    @GetMapping("/{name}")
    public String hello(@PathVariable("name") String name) {
        return "Hello, " + name;
    }
    
}

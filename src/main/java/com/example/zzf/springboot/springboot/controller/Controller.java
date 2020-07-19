package com.example.zzf.springboot.springboot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    @RequestMapping("/hi")
    public String response(){
        return "hello";
    }
}

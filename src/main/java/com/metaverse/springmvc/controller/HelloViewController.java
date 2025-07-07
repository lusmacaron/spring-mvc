package com.metaverse.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloViewController {
    @GetMapping("/static-hello")
    public String hello(){
        return "Hello.html";
    }
}

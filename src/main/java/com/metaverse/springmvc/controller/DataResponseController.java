package com.metaverse.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DataResponseController {
    @GetMapping("response/json/string")
    @ResponseBody
    public String helloStringJson() {
        return "{\"name\" : \"Meta\", \"age\" : 95}";
    }
}

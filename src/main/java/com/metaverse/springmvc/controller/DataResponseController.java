package com.metaverse.springmvc.controller;

import com.metaverse.springmvc.domain.Star;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataResponseController {
    @GetMapping("response/json/string")
    public String helloStringJson() {
        return "{\"name\" : \"Meta\", \"age\" : 95}";
    }

    @GetMapping("response/json/instance")
    public Star helloInstanceJson() {
        return new Star("Meta", 232);
    }
}

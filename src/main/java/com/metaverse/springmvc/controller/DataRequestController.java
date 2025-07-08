package com.metaverse.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hello/request")
public class DataRequestController {
    @GetMapping("/form/html")
    public String form() {
        return "hello-request-form";
    }

    // Path Variable 방식 요청을 받는 방법 @PathVariable
    @GetMapping("/star/{name}/age/{age}")
    @ResponseBody
    public String helloRequestPath(@PathVariable String name, @PathVariable int age) {
        return String.format("Hello, @PathVariable로 받은 값들, <br> name = %s, age = %d", name, age);
    }

    // QueryString 방식 요청 받는 방법 @RequestParam
    @GetMapping("/form/param")
    @ResponseBody
    public String helloRequestParam(@RequestParam String name, @RequestParam int age) {
        return String.format("Hello, @PathVariable로 받은 값들, <br> name = %s, age = %d", name, age);
    }
}

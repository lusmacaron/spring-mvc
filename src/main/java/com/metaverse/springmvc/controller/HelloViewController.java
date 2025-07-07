package com.metaverse.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloViewController {
    private static long visitCount = 0;

    @GetMapping("/static-hello")
    public String hello(){
        return "Hello.html";
    }

    @GetMapping("/html/redirect")
    public String htmlRedirect(){
        return "redirect:/hello.html";
    }

    @GetMapping("/html/templates")
    public String templates(){
        // ... 내부 로직이 추가 될 수 있음
        // prefix classpath: resources까지의 경로 +templates/까지 가지고있음
        // suffix .html
        return "hello-templates";
    }

    @GetMapping("html/dynamic")
    public String htmlDynamic(Model model) {
        visitCount++;
        model.addAttribute("visits", visitCount);
        return "hello-dynamic";
    }
}

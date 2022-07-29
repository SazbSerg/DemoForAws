package com.example.demoforaws.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OneController {
    @GetMapping("/")
    public String getIndexPage(){
        return "/page";
    }
}

package com.example.javahw;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hello {

    @GetMapping(value = "/")
    public String goToMainPage() {
        return "MainPage";
    }
}

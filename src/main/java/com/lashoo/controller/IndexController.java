package com.lashoo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class IndexController {

    @GetMapping("/welcome")
    public String getMessage(){
        return "Welcome to lashoo";
    }


}

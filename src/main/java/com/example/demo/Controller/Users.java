package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class Users {
    @RequestMapping("m")
    public String getUser() {
        return "this is he";
    }
    
}

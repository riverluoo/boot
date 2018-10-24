package com.riverluoo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/first")
    public Object first() {
        return "first controller";
    }

}

package com.start.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class QuickController {

    @RequestMapping("/quick")
    //@ResponseBody
    public String quick(){
        return "hello2111112 SpringBoot2";
    }
}

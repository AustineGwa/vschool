package com.gwazasoftwares.vschool.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {

    @RequestMapping("/")
    public String showDefaultPage(){
        return "this is a default page";
    }
}

package com.example.springvue.controllers;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;


@Controller

public class HomeController {

    @GetMapping("/example-page")
    public String index(HttpServletRequest request) {
        //System.out.print("pumpernickle");
        return "index";
    }

    @GetMapping("/welcome")
    public String welcome(HttpServletRequest request) {
        return "form";
    }

    @GetMapping("/admin-login")
    public String adminLogin(HttpServletRequest request) {
        return "form";
    }

}
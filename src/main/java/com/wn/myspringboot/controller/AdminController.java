package com.wn.myspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/hello")
    public String hello(HttpServletRequest request, HttpServletResponse response) {
        return "hello,admin";
    }
}

package com.wn.myspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/app")
public class AppController {

    @GetMapping("/hello")
    public String hello(HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for(Cookie cookie : cookies){
                System.out.println(cookie.getName() + ":" + cookie.getDomain());
            }
        }

        HttpSession session = request.getSession();
        session.setMaxInactiveInterval(100000);
        if(session != null){
            System.out.println(session.getId());
        }



        Cookie cookie = new Cookie("aa","bb");
//        cookie.setDomain("b.net");
        cookie.setPath("/");
        response.addCookie(cookie);
        return "hello,app";
    }
}

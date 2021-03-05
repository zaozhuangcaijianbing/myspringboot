package com.wn.myspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/menu1")
public class HelloController {


    @GetMapping("/hello")
    public String hello(HttpServletRequest request, HttpServletResponse response) {
//        Cookie[] cookies = request.getCookies();
//        if(cookies != null){
//            for(Cookie cookie : cookies){
//                System.out.println(cookie.getName() + "--" + cookie.getValue() + "--" + cookie.getDomain() + "--" + cookie.getPath());
//            }
//        }
//
//        Cookie cookie = new Cookie("a3","b3");
//        cookie.setDomain("wangningdemacbook-pro.local");
//        response.addCookie(cookie);


//        HttpSession session = request.getSession(false);
//        if(session != null){
//            System.out.println("session" + session.getId());
//        }

//        response.setHeader("Access-Control-Allow-Origin","*");


//        String contextPath = request.getContextPath();

//        HttpSession session = request.getSession();
//        if(session.isNew()){
//            session.setAttribute("username",session.getId());
//        }else{
//            String username = (String)session.getAttribute("username");
//            System.out.println(username);
//        }

        return "hello";
    }
}

package com.example.Exercitii.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@RestController
public class Ex2Cookie {

    @GetMapping("Ex2a")
    public String method1 (HttpServletRequest httpServletRequest) {
        Cookie[] cookies = httpServletRequest.getCookies();
        return "0: " + cookies[0].getName() + "=" + cookies[0].getValue();
    }

    @GetMapping("Ex2b")
    public String method2 (HttpServletRequest httpServletRequest) {
        return httpServletRequest.getHeader("Header");
    }

    @GetMapping("Ex2c")
    public String method3 (HttpServletRequest httpServletRequest) {
        return httpServletRequest.getHeaderNames().toString();
    }
}

package com.example.Exercitii.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Ex1Controller {

    @GetMapping("Ex1a")
    public String method1(HttpServletRequest httpServletRequest) {
        return "getRequestURL: " + httpServletRequest.getRequestURL();
    }

    @GetMapping("Ex1b")
    public String method2(HttpServletRequest httpServletRequest) {
        return "getRequestURI: " + httpServletRequest.getRequestURI();
    }

    @GetMapping("Ex1c")
    public String method3(HttpServletRequest httpServletRequest) {
        return "getServletPath: " + httpServletRequest.getServletPath();
    }

    @GetMapping("Ex1d")
    public String method4(HttpServletRequest httpServletRequest) {
        return "getContextPath: " + httpServletRequest.getContextPath();
    }

    @GetMapping("Ex1e")
    public String method5(HttpServletRequest httpServletRequest) {
        return "getQueryString: " + httpServletRequest.getQueryString();
    }
}

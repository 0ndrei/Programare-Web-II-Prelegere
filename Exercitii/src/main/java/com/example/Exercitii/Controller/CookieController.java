package com.example.Exercitii.Controller;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

@RestController
public class CookieController {
    private static final String MY_COOKIE = "cookieForIS31Z";
    @GetMapping("/cookies/add")
    public String addCookie(HttpServletResponse response) {
        Cookie uiColorCookie = new
                Cookie(MY_COOKIE, "keep_calm_and_do_programming");
        response.addCookie(uiColorCookie);
        return "Cookie added, please check!";
    }
    @GetMapping("/cookies/my-cookie")
    public String addCookie(HttpServletRequest request, @CookieValue(name
            = MY_COOKIE, required = false) String cookieValue) {
        return "my cookie value is:" + Objects.toString(cookieValue);
    }
}

package com.example.Exercitii.Controller;

import com.example.Exercitii.Method.Add;
import com.example.Exercitii.Method.Concat;
import com.example.Exercitii.Method.Operation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/Ex3")
public class Ex3Controller {
    @PostMapping("/add")
    public Integer add(@RequestBody Add numbers) {
        return numbers.a + numbers.b;
    }

    @PostMapping("concat")
    public String concat(@RequestBody Concat concat ) {
        return concat.a + concat.b;
    }

    @PostMapping("/operation")
    public Double op(@RequestBody Operation numbers) {
        return switch (numbers.operation) {
            case "+" -> (double) numbers.a + numbers.b;
            case "-" -> (double) numbers.a - numbers.b;
            case "/" -> (double) numbers.a / numbers.b;
            case "*" -> (double) numbers.a * numbers.b;
            default -> null;
        };
    }

    @GetMapping
    public String[] concatGet(HttpServletRequest request) {
        return request.getRequestURI().split("/");
    }
}

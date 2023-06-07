package com.example.web.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TodoController
 */
@RestController
@RequestMapping(path = "/todo")
public class HelloController {
    /**
     * return "Hello World!"
     */
    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

}
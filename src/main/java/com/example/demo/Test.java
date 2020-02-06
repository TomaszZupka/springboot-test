package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Test {
    @GetMapping("/")
    String test() {
        return "hello worlda";
    }

    @GetMapping("/api/test")
    String test1() {
        return "hello world anothera";
    }
}

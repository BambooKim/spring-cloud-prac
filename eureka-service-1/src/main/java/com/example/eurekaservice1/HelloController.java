package com.example.eurekaservice1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/first-service")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        log.info("hello");

        return "hello";
    }
}

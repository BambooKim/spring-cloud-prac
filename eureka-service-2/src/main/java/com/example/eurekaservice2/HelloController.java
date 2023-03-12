package com.example.eurekaservice2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/second-service")
@RestController
@Slf4j
public class HelloController {

    @GetMapping("hello2")
    public String hello() {
        log.info("hello");

        return "hello2";
    }
}

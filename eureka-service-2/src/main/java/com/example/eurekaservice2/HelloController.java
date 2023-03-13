package com.example.eurekaservice2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("feign-test-2")
    public String feignTest(@RequestParam Integer id,
                            @RequestParam String name) {
        log.info("called feignTest: {}, {}", id, name);

        return id.toString() + " " + name;
    }
}

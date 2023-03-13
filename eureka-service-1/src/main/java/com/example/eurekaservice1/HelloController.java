package com.example.eurekaservice1;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/first-service")
@RequiredArgsConstructor
public class HelloController {

    private final HelloClient helloClient;

    @GetMapping("/hello")
    public String hello() {
        log.info("hello");

        return "hello";
    }

    @GetMapping("/feign-test")
    public String feignTest(
            @RequestParam Integer id,
            @RequestParam String name
    ) {
        log.info("feignTest");

        String response = helloClient.call("suwon", id, name);

        log.info("res: " + response);

        return response;
    }
}

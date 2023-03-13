package com.example.eurekaservice1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.URI;

//@FeignClient(
//        name = "HelloClient",
//        url = "http://localhost:8081"
//)
@FeignClient(name = "eureka-service-2")
public interface HelloClient {

    @GetMapping("/second-service/feign-test-2")
    String call(
            @RequestHeader("region") String region,
            @RequestParam Integer id,
            @RequestParam String name
    );
}

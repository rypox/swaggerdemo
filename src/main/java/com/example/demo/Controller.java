package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.OffsetDateTime;
import java.util.Map;

@RestController
@RequestMapping("api")
public class Controller {
    @GetMapping(value = "time", produces = MediaType.TEXT_PLAIN_VALUE)
    public Mono<String> hello() {
        return Mono.just("Current time is: " + OffsetDateTime.now());
    }

    @GetMapping(value = "time", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Map<String, String>> helloJson() {
        return Mono.just(Map.of("currentTime", OffsetDateTime.now().toString()));
    }

}

package org.sample.resourcemanager.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/say-hello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello World!");
    }

}

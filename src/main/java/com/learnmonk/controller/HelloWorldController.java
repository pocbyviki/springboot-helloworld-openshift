package com.learnmonk.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/*
 * @Author Vivek Kumar
 * @Since 13/06/2020
 */
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public ResponseEntity<String> defaultHandle() {
        return ResponseEntity.ok("Deployed to Openshift Container:");
    }

    @GetMapping("/api/{name}")
    public ResponseEntity<String> sayHello(@PathVariable("name")String name) {
        return ResponseEntity.ok("Hello! "+name+", Welcome to Openshift platform.");
    }
}

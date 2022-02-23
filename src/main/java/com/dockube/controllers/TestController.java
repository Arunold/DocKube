package com.dockube.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private static final Logger log = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/test")
    public String testAPI() {
        log.info("{} : {}", System.currentTimeMillis(), System.getProperty("INS"));
        return System.currentTimeMillis() + "";
    }
}

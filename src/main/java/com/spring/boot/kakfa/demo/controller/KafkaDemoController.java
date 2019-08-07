package com.spring.boot.kakfa.demo.controller;

import com.spring.boot.kakfa.demo.producer.Producer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaDemoController {

    private final Producer producer;

    public KafkaDemoController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping(value = "/publish")
    public ResponseEntity send(@RequestParam(value = "message", required = false, defaultValue = "kakfa-test") String message) {
        this.producer.send(message);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}

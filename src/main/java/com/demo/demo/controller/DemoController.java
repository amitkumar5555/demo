package com.demo.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoController {
    @GetMapping
    public ResponseEntity<?> getDemoMessage(){
        return ResponseEntity.ok("Hello this is first api demo");
    }
}

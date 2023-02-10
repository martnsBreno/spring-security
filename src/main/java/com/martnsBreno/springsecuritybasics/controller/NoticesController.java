package com.martnsBreno.springsecuritybasics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {
    
    @GetMapping("/noticias")
    String getNotices() {
        return "Noticias";
    }
}

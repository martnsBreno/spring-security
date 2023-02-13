package com.martnsBreno.springsecuritybasics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.martnsBreno.springsecuritybasics.model.NoticeDetails;
import com.martnsBreno.springsecuritybasics.repository.NoticeRepository;

@RestController
public class NoticesController {
    
    @Autowired
    private NoticeRepository noticeRepository;
    
    @GetMapping("/noticias")
    public List<NoticeDetails> getAccountDetails() {
        List<NoticeDetails> notices = noticeRepository.findAll();
        
        if (notices != null) {
            return notices;
        } else {
            return null;
        }
    }
}

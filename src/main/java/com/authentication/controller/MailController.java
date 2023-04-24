package com.authentication.controller;

import com.authentication.repository.UserRepository;
import com.authentication.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class MailController {
    @Autowired
    private MailService mailSender;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/verifyCode")
    public void verifyCode(){
        mailSender.sendEmail("luong.vu1012@gmail.com","your otp",userRepository.findById(1).get().getUsername());
    }
}
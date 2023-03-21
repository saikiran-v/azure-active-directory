package com.ews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EwsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EwsApplication.class, args);
    }

    @GetMapping("/")
    public Authentication hello() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        System.out.println("authentication" + authentication);
        return authentication;
    }
}

package com.promise.micro.controller;

import com.promise.micro.config.Configuration;
import com.promise.micro.entities.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AccountController {
    private final Configuration config;

    @GetMapping("/")

    public Account getBase(){
        return new Account(config.getName(), config.getNumber());
    }
}

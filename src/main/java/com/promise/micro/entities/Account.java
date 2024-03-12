package com.promise.micro.entities;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Account {
    private String  name;
    private int number;

    public Account(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Account() {
    }
}

package com.promise.micro.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties("micro")
public class Configuration {
    private  String name;
    private int number;
}

package com.example.AdmissionAboard.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "src/main/resources/")
public class CustomPropertyConfig {

    @Value("${mailFrom}")
    public String mailFrom;

    @Value("${awsAccessKey}")
    public String awsAccessKey;

    @Value("${awsSecretKey}")
    public String awsSecretKey;
}


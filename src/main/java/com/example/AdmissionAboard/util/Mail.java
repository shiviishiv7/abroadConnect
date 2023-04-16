package com.example.AdmissionAboard.util;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
public class Mail {

    private String from;
    private String to;
    private String subject;
    private Map<String, Object> model;
}


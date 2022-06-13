package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "This is sad!";
    }
}

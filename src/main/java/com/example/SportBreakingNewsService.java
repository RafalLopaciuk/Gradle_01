package com.example;

import org.springframework.stereotype.Component;

@Component
public class SportBreakingNewsService implements BreakingNewsService{
    @Override
    public String getBreakingNews() {
        return "Adam Malysz win World Cup";
    }
}
package com.yousef.myApp.services;

import org.springframework.stereotype.Service;

@Service
public class FirstService implements ServiceInterface{
    @Override
    public String getMessage() {
        return "First Message";
    }
}

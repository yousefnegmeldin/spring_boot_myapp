package com.yousef.myApp.services;


import org.springframework.stereotype.Service;

@Service
public class SecondService implements ServiceInterface{
    @Override
    public String getMessage() {
        return "Second Message";
    }
}

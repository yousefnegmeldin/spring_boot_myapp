package com.yousef.myApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceConsumer {
    private FirstService firstService;
    private SecondService secondService;
    @Autowired
    public ServiceConsumer(FirstService firstService){
        this.firstService = firstService;
    }
    @Autowired
    public void setSecondService(SecondService secondService){
        this.secondService = secondService;
    }

    public void displayMessages(){
        System.out.println(firstService.getMessage());
        System.out.println(secondService.getMessage());
    }
}

package com.observerdesignpattern.controller;

import com.observerdesignpattern.service.ObserverService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("v1/")
public class ObserverController {
    ObserverService observerService;

    @GetMapping("attachSmartphone")
    public void attachSmartphone(){
        observerService.attachSmartphone();
    }

    @GetMapping("attachNotebook")
    public void attachNotebook(){
        observerService.attachNotebook();
    }

    @GetMapping("dettachSmartphone")
    public void dettachSmartphone(){
        observerService.dettachSmartphone();
    }

    @GetMapping("dettachNotebook")
    public void dettachNotebook(){
        observerService.dettachNotebook();
    }

    @GetMapping("notifyUpdate")
    public List<String> notifyUpdate(){
        return observerService.notifyUpdate();
    }
}

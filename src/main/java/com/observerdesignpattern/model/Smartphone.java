package com.observerdesignpattern.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Smartphone implements Observer{
    @Override
    public String update(String message){
        return "Smartphone: "+message;
    }
}

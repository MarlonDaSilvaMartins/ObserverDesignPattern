package com.observerdesignpattern.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Notebook implements Observer{
    @Override
    public String update(String message){
        return "Notebook: "+message;
    }
}

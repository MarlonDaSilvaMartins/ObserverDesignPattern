package com.observerdesignpattern.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DevicePublisher implements Subject{
    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void attach(Observer observer){
        observerList.add(observer);
    }

    @Override
    public void dettach(Observer observer){
        observerList.remove(observer);
    }

    @Override
    public List<String> notifyUpdate(String message){
        List<String> response = new ArrayList<>();
        for(Observer observer : observerList){
            response.add(observer.update(message));
        }
        return response;
    }
}

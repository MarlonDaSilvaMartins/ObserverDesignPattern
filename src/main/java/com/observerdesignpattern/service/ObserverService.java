package com.observerdesignpattern.service;

import com.observerdesignpattern.model.DevicePublisher;
import com.observerdesignpattern.model.Notebook;
import com.observerdesignpattern.model.Smartphone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObserverService {
    @Autowired
    DevicePublisher devicePublisher;

    Smartphone smartphone = new Smartphone();
    Notebook notebook = new Notebook();

    public void attachSmartphone(){
        devicePublisher.attach(smartphone);
    }

    public void attachNotebook(){
        devicePublisher.attach(notebook);
    }

    public void dettachSmartphone(){
        devicePublisher.dettach(smartphone);
    }

    public void dettachNotebook(){
        devicePublisher.dettach(notebook);
    }

    public List<String> notifyUpdate(){
        return devicePublisher.notifyUpdate("connected");
    }
}

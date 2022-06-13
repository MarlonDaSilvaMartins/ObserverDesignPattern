package com.observerdesignpattern.model;

import java.util.List;

public interface Subject {
    public void attach(Observer observer);
    public void dettach(Observer observer);
    public List<String> notifyUpdate(String message);
}

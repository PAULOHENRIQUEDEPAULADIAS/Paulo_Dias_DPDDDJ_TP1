package org.example;

import org.example.Interface.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class Publiser {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void notifySubscriber(String message){
        for (Subscriber s : subscribers){
            s.update(message);
        }
    }
}

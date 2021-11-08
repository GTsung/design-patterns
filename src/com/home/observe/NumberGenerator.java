package com.home.observe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author GTsung
 * @date 2021/11/8
 */
public abstract class NumberGenerator {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer o = (Observer) iterator.next();
            o.update(this);
        }
    }

    public abstract int getNumber();

    public abstract void execute();
}

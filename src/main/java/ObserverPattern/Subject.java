package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    abstract public void setState(String state);
    abstract public String getState();

    public void attach(Observer observer) {
        observers.add(observer);
    }
    public void notifyObservers() {
        for (Observer observer: observers)
            observer.update();
    }
}

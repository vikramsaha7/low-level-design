package observer;

import java.util.ArrayList;
import java.util.List;

public class ObserableImpl implements Obserable {
    List<Observer> observers = new ArrayList<>();
    Boolean changed = false;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

    @Override
    public void setChanged(boolean changed) {
        this.changed = changed;
        notifyObservers();
    }
}

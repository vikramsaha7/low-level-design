package observer;

public interface Obserable {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

    void setChanged(boolean b);
}

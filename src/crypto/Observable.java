package crypto;

public interface Observable {

    void registerObserver(Observer Observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}

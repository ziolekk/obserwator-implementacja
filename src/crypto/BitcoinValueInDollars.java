package crypto;

import java.util.ArrayList;
import java.util.Date;

public class BitcoinValueInDollars implements Observable {

    private double valueInDollars;
    private Date dateOfChange;
    private List<Observer> registeredObservers = new ArrayList<>();

    public BitcoinValueInDollars(double valueInDollars) {
        this.valueInDollars = valueInDollars;
        this.dateOfChange = new Date();
    }

    @Override
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: registeredObservers) {
            observer.update(this);
        }
    }

    public void changeValue(double valueInDollars) {
        this.valueInDollars = valueInDollars;
        this.dateOfChange = new Date();
    }
}

package b_observer;

/**
 * Created by ll on 04/02/2018.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}

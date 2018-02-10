package b_observer.impl;

import b_observer.DisplayElement;
import b_observer.Observer;
import b_observer.Subject;

/**
 * Created by ll on 04/02/2018.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public String toString() {
        return "CurrentConditionsDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", weatherData=" + weatherData +
                '}';
    }

    public void display() {
        System.out.println(toString());
    }
}

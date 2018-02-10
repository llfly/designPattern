package b_observer;

import b_observer.impl.CurrentConditionsDisplay;
import b_observer.impl.WeatherData;

/**
 * Created by ll on 04/02/2018.
 */
public class WeatherStation {
    public static void main(String [] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,55,29.2f);
        weatherData.setMeasurements(78,90,30.4f);

    }
}

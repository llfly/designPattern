package b_observer_builtin;

/**
 * Created by ll on 05/02/2018.
 */
public class WeatherStation {
    public static void main(String [] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(81,65,30.4f);
        weatherData.setMeasurements(83,55,29.2f);
        weatherData.setMeasurements(78,90,30.4f);
    }
}

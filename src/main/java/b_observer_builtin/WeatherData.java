package b_observer_builtin;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by ll on 05/02/2018.
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){}

    // public void update(Observable o, Object arg) {
        // Observable o 主题本身当作第一个变量，好让观察者知道是哪个主题通知它的
        // Object arg 传入 notityObservers() 的数据对象，如果没有则说明为空
    // }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();// 这里没有传入数据对象，表示采用 pull 方式获取数据
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}

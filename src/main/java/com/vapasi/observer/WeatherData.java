package com.vapasi.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable {
    private List<Observer> observers = new ArrayList();
    private double temp;
    private double humidity;
    private double pressure;

    public WeatherData(){
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
        measurementsChanged();
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
        measurementsChanged();
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
        measurementsChanged();
    }

    public void measurementsChanged() {
        observers.forEach(
              observer -> {
                  observer.update(temp, pressure, humidity);
              }
        );
    }

    @Override
    public void subscribe(Observer observeer) {
        observers.add(observeer);
    }

    @Override
    public void unsubscribe(Observer observeer) {
        observers.remove(observeer);
    }
}

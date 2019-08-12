package com.vapasi.observer;

public class TableDisplay implements Observer{
    private Double temp;
    private Double humidity;
    private Double pressure;

    public TableDisplay(Observable observable) {
        observable.subscribe(this);
    }

    public void update(Double temp, Double humidity, Double pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Table is Temp: " + temp + ", Humidity: " + humidity + ", pressure: " + pressure);
    }
}

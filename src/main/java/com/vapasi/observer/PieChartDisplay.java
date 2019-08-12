package com.vapasi.observer;

public class PieChartDisplay implements Observer{
    private Double temp;
    private Double humidity;
    private Double pressure;

    public PieChartDisplay(Observable observable) {
        observable.subscribe(this);
    }

    public void update(Double temp, Double humidity, Double pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Pie Chart is Temp: " + temp + ", Humidity: " + humidity + ", pressure: " + pressure);
    }
}

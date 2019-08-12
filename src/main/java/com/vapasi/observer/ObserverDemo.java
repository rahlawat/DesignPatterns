package com.vapasi.observer;

public class ObserverDemo {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        TableDisplay tableDisplay = new TableDisplay(weatherData);
        PieChartDisplay pieChartDisplay = new PieChartDisplay(weatherData);
        BarGraphDisplay barGraphDisplay = new BarGraphDisplay(weatherData);

        weatherData.measurementsChanged();
    }
}
